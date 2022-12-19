package com.vigp.demo.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionTranslator {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> hanldeNotFoundException() {
		return new ResponseEntity<String>("Not Found",HttpStatus.NOT_FOUND);
	}
	
}
