package com.product.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String message;
	private HttpStatus status = HttpStatus.NOT_FOUND;
	
	public ProductNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}
}
