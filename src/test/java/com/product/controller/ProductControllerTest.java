package com.product.controller;

import static org.mockito.Mockito.when;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.common.Constants;
import com.product.model.Price;
import com.product.model.Product;
import com.product.service.ProductService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductControllerTest {

	@Autowired
	private ProductController productController;
	
	@MockBean
	private ProductService productService;
	
	private List<Product> products = new ArrayList<Product>();
	
	
	@Before
	public void setup() {
		Price price1 = new Price(BigDecimal.valueOf(100.00), Constants.BASE_CURRENCY_EUR);
		Price price2 = new Price(BigDecimal.valueOf(200.00), Constants.BASE_CURRENCY_EUR);
		Price price3 = new Price(BigDecimal.valueOf(300.00), Constants.BASE_CURRENCY_EUR);
		Product product1 = new Product(1, "Product1", "This is Product1", price1);
		Product product2 = new Product(2, "Product2", "This is Product2", price2);
		Product product3 = new Product(3, "Product3", "This is Product3", price3);
		products.add(product1);
		products.add(product2);
		products.add(product3);
	}

	@Test
	public void testGetProducts() {
		when(productService.getProductsWithAllCurrencies()).thenReturn(products);
		ResponseEntity<List<Product>> updatedProductList = productController.getProductsWithAllCurrencies();
		
		Assert.assertEquals(updatedProductList.getBody().size(), 3);
		Assert.assertEquals(updatedProductList.getStatusCode(), HttpStatus.OK);
		Assert.assertNull(updatedProductList.getBody().get(0).getPricesInOtherCurrencies());
	}
	
	@Test
	public void testGetProductsWithAllCurrencies() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		List<Product> productsWithAllCurrencies = objectMapper.readValue(new ClassPathResource("productserviceoutput.json").getFile(), new TypeReference<List<Product>>(){});
		
		when(productService.getProductsWithAllCurrencies()).thenReturn(productsWithAllCurrencies);
		ResponseEntity<List<Product>> updatedProductList = productController.getProductsWithAllCurrencies();
		
		Assert.assertEquals(updatedProductList.getBody().size(), 3);
		Assert.assertEquals(updatedProductList.getStatusCode(), HttpStatus.OK);
		Assert.assertEquals(updatedProductList.getBody().get(0).getPricesInOtherCurrencies().size(),3);
	}
}
