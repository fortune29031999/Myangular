package com.myangular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class Globlaexception {
	
	@ExceptionHandler(value=Coursenotfoundexception.class)
	
	public ResponseEntity<Object> classnotfoundexception(Coursenotfoundexception f) {
		return new ResponseEntity<>(f.getMessage(),HttpStatus.OK);
	}

}
