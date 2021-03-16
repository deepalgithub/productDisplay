package com.product.exception;

import org.springframework.http.HttpStatus;

public class FixerApiException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	private String message;
	private HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
	
	public FixerApiException(String message) {
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
