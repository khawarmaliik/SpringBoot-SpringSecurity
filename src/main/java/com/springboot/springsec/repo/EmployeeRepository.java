package com.springboot.springsec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springsec.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
