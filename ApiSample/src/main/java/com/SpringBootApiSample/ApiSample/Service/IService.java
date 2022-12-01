package com.SpringBootApiSample.ApiSample.Service;

import java.util.List;

import org.springframework.web.servlet.function.EntityResponse;

import com.SpringBootApiSample.ApiSample.Entity.Employee;

public interface IService {
	List<Employee> getEmployees();
	Employee getEmployeeById(int id);
	boolean addEmployee(Employee employee);
	EntityResponse<Employee> updateEmployee(Employee employee);
	EntityResponse<Employee> deleteEmployee(Employee employee);
}
