package com.dugrasoft.employee.service;

import com.dugrasoft.employee.entity.Employee;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dugrasoft.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public void fetchEmployees() {

		List<Employee> listOfEmployees = employeeRepository.findAll();
		for (Employee employee : listOfEmployees) {
			System.out
					.println(employee.getEmail() + "...." + employee.getFirstName() + "...." + employee.getLastName());
		}
	}

	public void fetchEmployee(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee Not found with id :" + id));

		System.out.println(employee.getEmail() + " " + employee.getFirstName() + " " + employee.getLastName());
	}
	
	public void fetchEmployeeByEmail(String email) {
//		Employee employee = employeeRepository.findByEmail(email)
//				.orElseThrow(() -> new RuntimeException("Employee Not found with id :" + email));
		
		Employee employee = employeeRepository.findEmployeeByEmail(email)
				.orElseThrow(() -> new RuntimeException("Employee Not found with id :" + email));

		System.out.println(employee.getEmail() + " " + employee.getFirstName() + " " + employee.getLastName());
	}

}
