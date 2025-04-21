package com.shoping.ekart.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundEception extends RuntimeException{

	public ResourceNotFoundEception(String message) {
		super(message);
	}

	
}
