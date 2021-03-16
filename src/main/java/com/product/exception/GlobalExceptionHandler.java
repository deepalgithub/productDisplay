package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.product.model.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	protected ResponseEntity<ErrorDetails> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode(productNotFoundException.getStatus().name());
		errorDetails.setDescription(productNotFoundException.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, productNotFoundException.getStatus());
	}
	
	@ExceptionHandler(FixerApiException.class)
	protected ResponseEntity<ErrorDetails> handleFixerApiException(FixerApiException fixerApiException) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode(fixerApiException.getStatus().name());
		errorDetails.setDescription(fixerApiException.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, fixerApiException.getStatus());
	}
	
	@ExceptionHandler(ProductServiceException.class)
	protected ResponseEntity<ErrorDetails> handleProductServiceException(ProductServiceException productServiceException) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode(productServiceException.getStatus().name());
		errorDetails.setDescription(productServiceException.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, productServiceException.getStatus());
	}
	
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<ErrorDetails> handleRuntimeException(Exception exception) {
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setCode(HttpStatus.INTERNAL_SERVER_ERROR.name());
		errorDetails.setDescription("Runtime exception occurred : "+exception.getMessage());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
