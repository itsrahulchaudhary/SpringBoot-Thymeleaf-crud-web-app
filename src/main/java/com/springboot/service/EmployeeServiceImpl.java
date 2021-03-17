package com.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
 
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
       this.employeeRepository.save(employee);	
	}

	@Override
	public Employee getEmployeeById(long id) {
	    Employee employee = null;
	    Optional<Employee> optional = employeeRepository.findById(id);
	    if(optional.isPresent()) {
	    	employee= optional.get();
	    }else {
	    	throw new RuntimeException("Employee not found for id :: " + id);
	    }
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);	
	}

	@Override
	public Page<Employee> findPaginated(int pageNo, int pageSize) {
		 Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		 return this.employeeRepository.findAll(pageable);
	}

}
