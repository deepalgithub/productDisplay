package com.product.model;

import java.util.List;

public class Product {

	private int productId;
	private String productName;
	private String productDescription;
	private Price price;
	private List<Price> pricesInOtherCurrencies;
	
	public Product() {}
	
	public Product(int productId, String productName, String productDescription, Price price) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
	
	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public Price getPrice() {
		return price;
	}

	public List<Price> getPricesInOtherCurrencies() {
		return pricesInOtherCurrencies;
	}

	public void setPricesInOtherCurrencies(List<Price> pricesInOtherCurrencies) {
		this.pricesInOtherCurrencies = pricesInOtherCurrencies;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price + ", pricesInOtherCurrencies=" + pricesInOtherCurrencies
				+ "]";
	}
}
