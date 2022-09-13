package com.springmysql.springback.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springmysql.springback.exception.ResourceNotFoundException;
import com.springmysql.springback.model.Employee;
import com.springmysql.springback.repository.EmployeeRepository;
import com.springmysql.springback.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	// before implementing EmployeeService, we need to inject employeeRepository
	// services
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

	@Override
	public Employee getEmployeeById(long employeeId) {
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new ResourceNotFoundException("Employee", "Id", employeeId);
		}
		// java lambda
		// return employeeRepository.findById(employeeId)
		// .orElseThrow(() -> new ResourceNotFoundException("Employee", "ID",
		// employeeId));
	}

	@Override
	public Employee updateEmployee(Employee employee, long employeeId) {
		// check if perticular employeewith the given employeeId exist or not
		Employee existingEmployee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "ID", employeeId));

		// update existing employee with new data
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());

		return employeeRepository.save(existingEmployee);
	}

	@Override
	public void deleteEmployee(long employeeId) {
		// check if perticular employeewith the given employeeId exist or not
		employeeRepository.findById(employeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "ID", employeeId));
				
		employeeRepository.deleteById(employeeId);
	}

}
