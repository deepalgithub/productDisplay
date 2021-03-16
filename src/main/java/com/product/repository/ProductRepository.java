package com.product.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.product.common.Constants;
import com.product.model.Price;
import com.product.model.Product;

/**
 * Product Repository. 
 * @author Deepal Tripathi
 *
 */
@Repository
public class ProductRepository {

	/**
	 * Method used to get list of Products.
	 * @return list of Products as List
	 */
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Price price1 = new Price(BigDecimal.valueOf(100.00), Constants.BASE_CURRENCY_EUR);
		Price price2 = new Price(BigDecimal.valueOf(200.00), Constants.BASE_CURRENCY_EUR);
		Price price3 = new Price(BigDecimal.valueOf(300.00), Constants.BASE_CURRENCY_EUR);
		Product product1 = new Product(1, "Product1", "This is Product1", price1);
		Product product2 = new Product(2, "Product2", "This is Product2", price2);
		Product product3 = new Product(3, "Product3", "This is Product3", price3);
		products.add(product1);
		products.add(product2);
		products.add(product3);
		return products;
	}
}