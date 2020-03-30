package com.springboot.springsec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.springsec.model.Employee;
import com.springboot.springsec.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@RequestMapping("/index")
	public String Index() {
		return "index";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Employee employee = new Employee();
		theModel.addAttribute("employee", employee);
		return "addemp";
		}
	
	@RequestMapping("/addEmp")
	public String addEmp(Employee emp) {
		empService.createEmployee(emp);
		return "redirect:/getAllEmps";
	}
	
	@RequestMapping("/searchEmpById")
	public String employeeById(Model theModel, @RequestParam int empId) {
		Optional<Employee> employee = empService.searchEmployeeById(empId);
		theModel.addAttribute("employee", employee);
		return "searchempbyid";
	}
	
	@RequestMapping("/getAllEmps")
	public String listEmployee(Model theModel) {
		List<Employee> employee = empService.getAllEmp();
		theModel.addAttribute("employee", employee);
		return "getallemps";
	}
	
	@RequestMapping("deleteEmp")
	public String deleteEmp(@RequestParam("empId") int empId) {
		empService.deleteEmployee(empId);
		return "redirect:/getAllEmps";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("empId") int empId,
									Model theModel){
		Optional<Employee> employee = empService.searchEmployeeById(empId);	
		theModel.addAttribute("employee", employee);
		return "editemp";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
