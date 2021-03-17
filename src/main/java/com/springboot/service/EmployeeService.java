package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	public void deleteEmployeeById(long id);

}
