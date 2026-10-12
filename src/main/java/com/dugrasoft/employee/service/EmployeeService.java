package com.dugrasoft.employee.service;

public interface EmployeeService {

	public void fetchEmployees();
	
	public void fetchEmployee(Long id);
	public void fetchEmployeeByEmail(String email);
}
