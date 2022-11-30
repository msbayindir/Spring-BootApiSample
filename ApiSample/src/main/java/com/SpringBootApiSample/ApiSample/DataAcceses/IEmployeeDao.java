package com.SpringBootApiSample.ApiSample.DataAcceses;

import java.util.List;

import org.springframework.web.servlet.function.EntityResponse;

import com.SpringBootApiSample.ApiSample.Entity.Employee;

public interface IEmployeeDao {

	List<Employee> getEmployees();
	Employee getEmployeeById(int id);
	EntityResponse<Employee> addEmployee(Employee employee);
	EntityResponse<Employee> updateEmployee(Employee employee);
	EntityResponse<Employee> deleteEmployee(Employee employee);
	
}
