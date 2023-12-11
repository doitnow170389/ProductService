package com.productpriceservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductPriceExceptionHandler {
	@ExceptionHandler(value = { ProductPriceNotFoundException.class})
	public ResponseEntity<Object> handlerProductPriceNotfound(ProductPriceNotFoundException pException) {
		ProductException productException = new ProductException(pException.getMessage(), pException.getCause(),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<Object>(productException, HttpStatus.NOT_FOUND);

	}
}
