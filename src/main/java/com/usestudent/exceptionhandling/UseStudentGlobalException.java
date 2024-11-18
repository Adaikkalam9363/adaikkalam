package com.usestudent.exceptionhandling;

import javax.naming.NameNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.usestudent.exception.AgeException;

@RestControllerAdvice
public class UseStudentGlobalException {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<Object> eligible(AgeException e) {
		return new ResponseEntity<>("Age not Eligible Exception occur:",HttpStatus.NOT_FOUND);
	}
}
