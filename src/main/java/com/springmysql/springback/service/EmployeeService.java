package com.springmysql.springback.service;

import java.util.List;

import com.springmysql.springback.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
	Employee getEmployeeById(long employeeId);
    Employee updateEmployee(Employee employee, long employeeId);
	void deleteEmployee(long employeeId);
}
