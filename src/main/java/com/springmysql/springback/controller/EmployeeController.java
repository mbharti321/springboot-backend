package com.springmysql.springback.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmysql.springback.model.Employee;
import com.springmysql.springback.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	// use constructor based dependency injection
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	// build create employee REST API
	// @RequestBody helps to fetch employee object from request body
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(
				employeeService.saveEmployee(employee),
				HttpStatus.CREATED);
	}

	// build get all employee REST API
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

}
