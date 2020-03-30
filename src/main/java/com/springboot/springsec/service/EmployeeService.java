package com.springboot.springsec.service;

import java.util.List;
import java.util.Optional;

import com.springboot.springsec.model.Employee;

public interface EmployeeService {
	public Employee createEmployee(Employee emp);
	public Optional<Employee> searchEmployeeById(int empId);
	public List<Employee> getAllEmp();
	public void deleteEmployee(int id);
}
