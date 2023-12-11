package com.productpriceservice.exception;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
public class ProductException {
private final String message;
private final Throwable throwable;	
private final HttpStatus status;
}
