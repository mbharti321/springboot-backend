package com.springmysql.springback.service;

import java.util.List;

import com.springmysql.springback.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
}
