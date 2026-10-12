package com.dugrasoft.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dugrasoft.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	@GetMapping
	public void getEmployees() {
		employeeService.fetchEmployees();
	}
	
	// Based on employee id want to fetch the information
	
	@GetMapping("/{id}")
	public void getEmployee(@PathVariable Long id) {
		employeeService.fetchEmployee(id);
	}
	
	@GetMapping("/email/{email}")
	public void getEmployeeByEmail(@PathVariable String email) {
		employeeService.fetchEmployeeByEmail(email);
	}

}
