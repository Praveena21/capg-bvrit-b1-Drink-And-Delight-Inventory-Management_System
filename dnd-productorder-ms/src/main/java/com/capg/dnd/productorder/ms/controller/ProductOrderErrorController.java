package com.capg.dnd.productorder.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.capg.dnd.productorder.ms.exception.ProductOrderIdNotFoundException;

//@RestControllerAdvice

public class ProductOrderErrorController {
	@ExceptionHandler(value= ProductOrderIdNotFoundException.class)
	public ResponseEntity<String> handleNotFoundException(ProductOrderIdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}
