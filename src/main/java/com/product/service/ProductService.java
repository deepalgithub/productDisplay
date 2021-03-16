package com.product.service;

import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static com.product.common.Constants.FIXER_API_EMPTY_RESPONSE;
import static com.product.common.Constants.PRODUCTS_NOT_FOUND;
import com.product.exception.FixerApiException;
import com.product.exception.ProductNotFoundException;
import com.product.exception.ProductServiceException;
import com.product.model.FixerRate;
import com.product.model.Price;
import com.product.model.Product;
import com.product.repository.ProductRepository;

/**
 * Service class used for Product related services.
 * @author Deepal Tripathi
 *
 */
@Service
public class ProductService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

	@Value("${fixer.api.url}")
	private String fixerApiUrl;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ProductRepository productRepository;
	
	/**
	 * Method will return the list of all the products.
	 * @return List of Products
	 */
	public List<Product> getProducts() {
		LOGGER.info("In getProducts method of ProductService");
		Optional<List<Product>> products = Optional.of(productRepository.getProducts());
		if(products.isPresent() && !products.get().isEmpty()) {
			return productRepository.getProducts();
		} else {
			throw new ProductNotFoundException(PRODUCTS_NOT_FOUND);	
		}
	}
	
	/**
	 * Method will get the list of products along with price being displayed in other currencies.
	 * @return List of products
	 */
	public List<Product> getProductsWithAllCurrencies() {
		LOGGER.info("In getProductsWithAllCurrencies method of ProductService");
		List<Product> updatedProductList = new ArrayList<Product>();
		Optional<List<Product>> products = Optional.of(productRepository.getProducts());
		if(products.isPresent() && !products.get().isEmpty()) {
			Optional<HashMap<String, Double>> rates = Optional.ofNullable(getRatesInDifferentCurrencies());	
			if(rates.isPresent() && !rates.get().isEmpty()) {
				for (Product product : products.get()) {
					List<Price> currencySpecificPrices = new ArrayList<>();
					rates.get().entrySet().stream()
							.forEach(e -> currencySpecificPrices.add(new Price(BigDecimal.valueOf(e.getValue()).multiply(product.getPrice().getAmount()), e.getKey())));
					product.setPricesInOtherCurrencies(currencySpecificPrices);
					updatedProductList.add(product);
				} 
			}else {
				throw new FixerApiException(FIXER_API_EMPTY_RESPONSE);
			}
		} else {
			throw new ProductNotFoundException(PRODUCTS_NOT_FOUND);
		}
		return updatedProductList;
	}
	
	/**
	 * Method will call Fixer API, assuming that the base currency is EUR (because of restricted access with free version of Fixer API), if required can be changed and passed as method argument.
	 * @return rates as HashMap
	 */
	private HashMap<String, Double> getRatesInDifferentCurrencies() {
		LOGGER.info("In getRatesInDifferentCurrencies method of ProductService");
		
		URI uri = UriComponentsBuilder.fromHttpUrl(fixerApiUrl).build().toUri();
		
		FixerRate fixerRate = null;
		try {
			fixerRate = restTemplate.getForObject(uri, FixerRate.class);
			LOGGER.info("Fixer API response status : {}", fixerRate.getSuccess());
		} catch (RestClientException clientException) {
			throw new ProductServiceException("Error occurred while calling Fixer API : "+clientException.getMessage());
		} catch (Exception fixerApiException) {
			throw new FixerApiException("Error received from Fixer API : "+fixerApiException.getMessage());
		}
		return fixerRate.getRates();
	}
}
