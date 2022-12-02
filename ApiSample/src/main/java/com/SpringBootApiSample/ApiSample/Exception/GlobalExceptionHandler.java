package com.SpringBootApiSample.ApiSample.Exception;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Response> notFoundException(Exception ex,WebRequest request) {
				
		Response response = new Response(ex.getMessage(),LocalDate.now(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<Response>(response,HttpStatus.NOT_FOUND);
	}
}
