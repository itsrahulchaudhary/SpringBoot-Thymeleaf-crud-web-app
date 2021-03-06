package com.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.springboot.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	public void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	public void deleteEmployeeById(long id);
	
	Page < Employee > findPaginated(int pageNo, int pageSize);

}
