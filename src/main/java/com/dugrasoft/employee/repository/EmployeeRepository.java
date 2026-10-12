package com.dugrasoft.employee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dugrasoft.employee.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

	public Optional<Employee> findByEmail(String email);
	
	
	@Query("SELECT e FROM Employee e WHERE e.email=:email") //JPQL 
	
	//want to fetch the employee details based on the salary and dept
	
	//select * from employee where emil="sai@gmail.com
	public Optional<Employee> findEmployeeByEmail(String email);
}
