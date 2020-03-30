package com.springboot.springsec.dao;

import java.util.List;
import java.util.Optional;

import com.springboot.springsec.model.Employee;

public interface EmployeeDao {
	
	public Employee createEmployee(Employee emp);
	public Optional<Employee> searchEmployeeById(int empId);
	public List<Employee> getAllEmp();
	public void deleteEmployee(int id);
}
