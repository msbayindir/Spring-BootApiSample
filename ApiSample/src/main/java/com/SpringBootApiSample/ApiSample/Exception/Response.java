package com.SpringBootApiSample.ApiSample.Exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

	private String message;
	private LocalDate date;
	private HttpStatus status;
	
}
