package com.capg.dnd.distributordetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Distributor Not Found", value = HttpStatus.NOT_FOUND)
public class DistributorIdNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DistributorIdNotFoundException(String message) 
	{
		
		super(message);
	}


}