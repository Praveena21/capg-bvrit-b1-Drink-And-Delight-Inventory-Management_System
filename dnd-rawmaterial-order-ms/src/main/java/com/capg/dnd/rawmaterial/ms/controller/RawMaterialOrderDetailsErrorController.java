package com.capg.dnd.rawmaterial.ms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.capg.dnd.rawmaterial.ms.exceptions.IdNotFoundException;

@RestControllerAdvice

public class RawMaterialOrderDetailsErrorController {
	@ExceptionHandler(value= IdNotFoundException.class)
	public ResponseEntity<String> handleNotFoundException(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
}
