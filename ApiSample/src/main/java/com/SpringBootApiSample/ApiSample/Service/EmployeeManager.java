package com.SpringBootApiSample.ApiSample.Service;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.EntityResponse;

import com.SpringBootApiSample.ApiSample.DataAcceses.IEmployeeDao;
import com.SpringBootApiSample.ApiSample.Entity.Employee;

@Component
public class EmployeeManager implements IService {

	private IEmployeeDao _empDao;
	public EmployeeManager(IEmployeeDao _empDao) {
		super();
		this._empDao = _empDao;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return _empDao.getEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return _empDao.getEmployeeById(id);
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
