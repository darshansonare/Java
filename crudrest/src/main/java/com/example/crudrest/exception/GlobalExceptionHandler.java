package com.example.crudrest.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String,String>> handleResourceNotFound(ResourceNotFoundException ex){
		Map<String,String> error=new HashMap<>();
		error.put("error", ex.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	public ResponseEntity<Map<String,String>> handleValidationErrors(MethodArgumentNotValidException ex){
		Map<String,String> errors=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(err->
		    errors.put(err.getField(), err.getDefaultMessage())
		    
		);
		return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	}
}
