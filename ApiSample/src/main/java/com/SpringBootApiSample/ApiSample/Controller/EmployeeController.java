package com.SpringBootApiSample.ApiSample.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.SpringBootApiSample.ApiSample.Entity.Employee;
import com.SpringBootApiSample.ApiSample.Service.IService;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	private IService _manager;
	
	public EmployeeController(IService _manager) {
		
		this._manager = _manager;
	}
	@GetMapping(path="/emp")
	public List<Employee> getEmployees(){
		
		
		return _manager.getEmployees();
	}
	
	@GetMapping(path="/emp/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		
		return _manager.getEmployeeById(id);
	}
	
	
	@PostMapping(path="/emp")
	@ResponseBody
	public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee) {
		
		if(_manager.addEmployee(employee))return ResponseEntity.created(null).body(employee);
		return null;
	}
	
}

