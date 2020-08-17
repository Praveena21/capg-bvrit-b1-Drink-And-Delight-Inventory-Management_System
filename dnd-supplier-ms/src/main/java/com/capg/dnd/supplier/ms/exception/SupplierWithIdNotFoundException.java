package com.capg.dnd.supplier.ms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Supplier with Id not Found", value = HttpStatus.NOT_FOUND)
public class SupplierWithIdNotFoundException extends RuntimeException{
	
	public SupplierWithIdNotFoundException(String msg) {
		super(msg);
	}

}