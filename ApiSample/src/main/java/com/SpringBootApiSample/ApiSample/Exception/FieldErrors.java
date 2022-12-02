package com.SpringBootApiSample.ApiSample.Exception;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FieldErrors {

	private String fieldMessage;
	private LocalDate date;
	private HttpStatus status;
	private String message;

}
