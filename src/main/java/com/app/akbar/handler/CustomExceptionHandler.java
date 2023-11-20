package com.app.akbar.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.akbar.exception.StudentNotFoundException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<String> showStudentNotFoundException(StudentNotFoundException snfe) {
		return new ResponseEntity<>(snfe.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
