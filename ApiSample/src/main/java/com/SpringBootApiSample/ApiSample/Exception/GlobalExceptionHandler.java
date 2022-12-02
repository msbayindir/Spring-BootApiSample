package com.SpringBootApiSample.ApiSample.Exception;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Response> notFoundException(Exception ex,WebRequest request) {
				
		Response response = new Response(ex.getMessage(),LocalDate.now(),HttpStatus.NOT_FOUND);
		return new ResponseEntity<Response>(response,HttpStatus.NOT_FOUND);
	}

	

	@Override
	protected ResponseEntity handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		// TODO Auto-generated method stub
		String Errors = " ";
		for(FieldError field:ex.getFieldErrors()) {
		  Errors += " "+field.getDefaultMessage()+" ";
		}
		System.out.println(Errors);
		FieldErrors response = new FieldErrors(Errors,LocalDate.now(),HttpStatus.INTERNAL_SERVER_ERROR,ex.getMessage());
		return new ResponseEntity<FieldErrors>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
}
