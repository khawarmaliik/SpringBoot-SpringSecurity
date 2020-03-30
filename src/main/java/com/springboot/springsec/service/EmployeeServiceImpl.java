package com.springboot.springsec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.springsec.dao.EmployeeDao;
import com.springboot.springsec.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empDao;
	
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao= empDao;
	}
	
	@Override
	public Employee createEmployee(Employee emp) {
		return empDao.createEmployee(emp);
	}

	@Override
	public Optional<Employee> searchEmployeeById(int empId) {
		Optional<Employee> emp = empDao.searchEmployeeById(empId);
		return emp;
	}

	@Override
	public List<Employee> getAllEmp() {
		return empDao.getAllEmp();
	}

	@Override
	public void deleteEmployee(int id) {
		empDao.deleteEmployee(id);
	}
}
