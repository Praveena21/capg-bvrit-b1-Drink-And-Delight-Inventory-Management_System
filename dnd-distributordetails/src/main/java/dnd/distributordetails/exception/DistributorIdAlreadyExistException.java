package dnd.distributordetails.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Distributor Id Already Exist", value = HttpStatus.NOT_FOUND)

public class DistributorIdAlreadyExistException extends RuntimeException {

	public DistributorIdAlreadyExistException(String msg) {
		super(msg);
	}
}
