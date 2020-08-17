package com.capg.dnd.supplier.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dnd.supplier.ms.exception.SupplierWithIdNotFoundException;

@ControllerAdvice
@RestController
public class SupplierErrorController {
@ExceptionHandler(SupplierWithIdNotFoundException.class)
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Supplier with id is NOT FOUND", code = HttpStatus.NOT_FOUND)
public void SupplierWithIdNotFound() {
	
}
}
