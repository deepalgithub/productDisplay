package com.product.exception;

import org.springframework.http.HttpStatus;

public class ProductServiceException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	private String message;
	private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
	
	public ProductServiceException(String message) {
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
