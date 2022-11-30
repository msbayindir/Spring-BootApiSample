package com.SpringBootApiSample.ApiSample.DataAcceses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.EntityResponse;

import com.SpringBootApiSample.ApiSample.Entity.Employee;

@Component
public class EmployeeDao implements IEmployeeDao {

	private static List<Employee> employees = new ArrayList<Employee>();
	private static int id = 0;
	static {
		employees.add(new Employee(++id,"Sefa","sadasd@gmail.com"));
		employees.add(new Employee(++id,"Ali","sadasd@gmail.com"));
		employees.add(new Employee(++id,"Veli","Velid@gmail.com"));
		employees.add(new Employee(++id,"Ayşe","Ayse@gmail.com"));
		employees.add(new Employee(++id,"Fatma","Fatma@gmail.com"));
	}
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponse<Employee> addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponse<Employee> updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponse<Employee> deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
