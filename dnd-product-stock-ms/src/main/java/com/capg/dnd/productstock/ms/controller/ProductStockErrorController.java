package com.capg.dnd.productstock.ms.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capg.dnd.productstock.ms.exception.InvalidExpiryDateException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdAlreadyExistsException;
import com.capg.dnd.productstock.ms.exception.ProductOrderIdNotFoundException;
import com.capg.dnd.productstock.ms.model.ErrorResponse;

@RestControllerAdvice
public class ProductStockErrorController {
	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(value = { ProductOrderIdAlreadyExistsException.class })
	public ErrorResponse handleProductOrderIdAlreadyExistsException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

	}
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = { ProductOrderIdNotFoundException.class })
	public ErrorResponse handleProductOrderIdNotFoundException(Exception ex, HttpServletRequest req) {

		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.value(), req.getRequestURL().toString());

	}

	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	@ExceptionHandler(value = { InvalidExpiryDateException.class })
	public ErrorResponse handleInvalidExpiryDateException(Exception ex, HttpServletRequest req) {
		return new ErrorResponse(new Date(), ex.getMessage(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
				HttpStatus.BAD_REQUEST.ordinal(), req.getRequestURI().toString());
	}
	
}
