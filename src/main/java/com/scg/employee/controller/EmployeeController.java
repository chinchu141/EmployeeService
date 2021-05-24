package com.scg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.scg.employee.service.EmployeeService;
import com.scg.employee.vo.EmployeeVO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	
	  

	  
	@PostMapping
	public EmployeeVO addEmployee(@RequestBody final EmployeeVO employeeVO) {

		return employeeService.addEmployee(employeeVO);
	}



	@GetMapping("/list")
	public List<EmployeeVO> getEmployee() {

		return employeeService.getEmployees();
	}

	
	@GetMapping("/lists")
	public String listDepartments() {

		return employeeService.getAllDepartments();

		


		 
	}
}
