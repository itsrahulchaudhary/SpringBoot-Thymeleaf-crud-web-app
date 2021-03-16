package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	  @RequestMapping({"/"}) 
	  public String getAllEmployees(Model model) {
	  model.addAttribute("listofEmployees", employeeService.getAllEmployees());
	  return "index";
	  
	  }
	 

	
}
