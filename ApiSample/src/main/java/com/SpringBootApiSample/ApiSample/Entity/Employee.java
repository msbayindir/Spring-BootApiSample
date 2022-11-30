package com.SpringBootApiSample.ApiSample.Entity;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Component
@Entity
public class Employee {
	
	@NotBlank(message="id is null")
	private int id;
	@NotBlank(message="name is not null")
	private String Name;
	@Email(message="do not allow this email")
	private String email;
	
}
