package com.springboot.springsec.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.springsec.model.Employee;
import com.springboot.springsec.repo.EmployeeRepository;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	EmployeeRepository empRepo;
	
	public EmployeeDaoImpl(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	@Override
	public Employee createEmployee(Employee emp) {
		return empRepo.save(emp);	}

	@Override
	public Optional<Employee> searchEmployeeById(int empId) {
		Optional<Employee> emp = empRepo.findById(empId);
		return emp;
	}

	@Override
	public List<Employee> getAllEmp() {
		return empRepo.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
		empRepo.deleteById(id);
	}
	
	

}
