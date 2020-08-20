package com.capg.dnd.supplier.ms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Supplier with Id Already Exist", value = HttpStatus.NOT_FOUND)

public class SupplierWithIdAlreadyExistException extends RuntimeException {

	public SupplierWithIdAlreadyExistException(String msg) {
		super(msg);
	}
}
