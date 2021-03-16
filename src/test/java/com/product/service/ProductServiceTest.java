package com.product.service;

import static org.mockito.Mockito.when;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.exception.FixerApiException;
import com.product.exception.ProductNotFoundException;
import com.product.exception.ProductServiceException;
import com.product.model.FixerRate;
import com.product.model.Product;
import com.product.repository.ProductRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

	@Autowired
	private ProductService productService;
	
	@MockBean
	private RestTemplate restTemplate;
	
	@SpyBean
	private ProductRepository productRepository;
	
	@Test
	public void testGetRatesInDifferentCurrencies() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		FixerRate fixerRate = objectMapper.readValue(new ClassPathResource("fixeroutput.json").getFile(), new TypeReference<FixerRate>(){});
		when(restTemplate.getForObject(Mockito.any(URI.class), Mockito.any())).thenReturn(fixerRate);
		List<Product> productList = productService.getProductsWithAllCurrencies();
		
		Assert.assertNotNull(productList);
		Assert.assertEquals(3, productList.size());
		Assert.assertEquals(productList.get(0).getPricesInOtherCurrencies().size(), 168);
		Assert.assertEquals(productList.get(0).getPricesInOtherCurrencies().stream().filter(price -> price.getCurrency().equals("GBP"))
				.collect(Collectors.toList()).get(0).getAmount().compareTo(BigDecimal.valueOf(85.8517)), 0);
	}
	
	@Test(expected = FixerApiException.class)
	public void testGetRatesInDifferentCurrencies_FixerApiException() {
		when(restTemplate.getForObject(Mockito.any(URI.class), Mockito.any())).thenReturn(new FixerRate());
		productService.getProductsWithAllCurrencies();
	}
	
	@Test(expected = ProductNotFoundException.class)
	public void testGetRatesInDifferentCurrencies_ProductNotFoundException() {
		when(productRepository.getProducts()).thenReturn(new ArrayList<Product>());
		productService.getProductsWithAllCurrencies();
	}
	
	@Test(expected = ProductServiceException.class)
	public void testGetRatesInDifferentCurrencies_FixerApiClientException() {
		when(restTemplate.getForObject(Mockito.any(URI.class), Mockito.any())).thenThrow(new RestClientException("Client side exception"));
		productService.getProductsWithAllCurrencies();
	}
	
	@Test(expected = FixerApiException.class)
	public void testGetRatesInDifferentCurrencies_FixerApiServerException() {
		when(restTemplate.getForObject(Mockito.any(URI.class), Mockito.any())).thenThrow(new RuntimeException("Server side exception"));
		productService.getProductsWithAllCurrencies();
	}
}
