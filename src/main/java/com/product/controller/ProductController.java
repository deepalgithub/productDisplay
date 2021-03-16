package com.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;

/**
 * Controller class used for Product related services.
 * @author Deepal Tripathi
 *
 */
@RestController
public class ProductController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductService productService;

	/**
	 * Method used to get list of products
	 * @return ResponseEntity
	 */
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		LOGGER.info("In getProducts method of ProductController");
		List<Product> products = productService.getProducts();
		return  new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
	
	/**
	 * Method used to get list of products with all the currencies
	 * @return ResponseEntity
	 */
	@GetMapping("/productsWithAllCurrencies")
	public ResponseEntity<List<Product>> getProductsWithAllCurrencies(){
		LOGGER.info("In getProductsWithAllCurrencies method of ProductController");
		List<Product> productList = productService.getProductsWithAllCurrencies();
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}
	
}
