package com.SpringBootApiSample.ApiSample.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootApiSample.ApiSample.DataAcceses.EmployeeDao;
import com.SpringBootApiSample.ApiSample.Entity.Employee;
import com.SpringBootApiSample.ApiSample.Service.IService;

@RestController
public class EmployeeController {
	private IService _manager;
	
	public EmployeeController(IService _manager) {
		
		this._manager = _manager;
	}
	@GetMapping(path="/emp")
	public List<Employee> getEmployees(){
		
		EmployeeDao dao = new EmployeeDao();
		return dao.getEmployees();
	}
	
	
}

