package com.scg.employee.service;

import java.util.List;

import com.scg.employee.vo.EmployeeVO;



public interface EmployeeService {
	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<EmployeeVO> getEmployees();

	String getAllDepartments();

	

 
}
