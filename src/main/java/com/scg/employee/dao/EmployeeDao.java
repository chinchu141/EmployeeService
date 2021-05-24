package com.scg.employee.dao;

import java.util.List;

import com.scg.employee.vo.EmployeeVO;



public interface EmployeeDao {

	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<EmployeeVO> getEmployees();

	

}