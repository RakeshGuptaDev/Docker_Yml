package com.laptop.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllException {
	
	@ExceptionHandler(LaptopNotFoundException.class)
	public ResponseEntity<Map<String, String>> handleException(LaptopNotFoundException l)
	{
		Map<String, String> m = new HashMap<>();
		m.put("error message : ", "please enter valid input");
		return new ResponseEntity<>(m,HttpStatus.BAD_REQUEST);
	}

}
