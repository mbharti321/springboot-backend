package com.springmysql.springback.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmysql.springback.model.Employee;
import com.springmysql.springback.repository.EmployeeRepository;
import com.springmysql.springback.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	//	before implementing EmployeeService, we need to inject employeeRepository services
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
