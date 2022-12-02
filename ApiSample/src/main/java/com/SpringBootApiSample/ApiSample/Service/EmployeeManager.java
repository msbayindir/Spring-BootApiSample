package com.SpringBootApiSample.ApiSample.Service;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.EntityResponse;

import com.SpringBootApiSample.ApiSample.DataAcceses.IEmployeeDao;
import com.SpringBootApiSample.ApiSample.Entity.Employee;
import com.SpringBootApiSample.ApiSample.Exception.EmployeeNotFoundException;


@Service
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
		Employee emp = _empDao.getEmployeeById(id);
		if(emp==null)throw new EmployeeNotFoundException("User Not Found");
		return emp;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		
		
		
		if(_empDao.addEmployee(employee))return true;
		return false;
		
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
