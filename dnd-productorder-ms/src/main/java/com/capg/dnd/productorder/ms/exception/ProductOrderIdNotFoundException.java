package com.capg.dnd.productorder.ms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



//@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND,reason  = " ProductOrderId not Found", value = HttpStatus.NOT_FOUND)
public class ProductOrderIdNotFoundException extends RuntimeException{
	
	public ProductOrderIdNotFoundException(String msg) {
		super(msg);
	}
}