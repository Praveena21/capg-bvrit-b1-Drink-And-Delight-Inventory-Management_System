package dnd.distributordetails.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import dnd.distributordetails.exception.DistributorIdNotFoundException;

@ControllerAdvice
@RestController
public class DistributorErrorController {

	@ExceptionHandler(DistributorIdNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Distributor with this id is Not Found" , code = HttpStatus.NOT_FOUND)
	public void DistributorWithIdNotFoundException() {
		
	}
	
}