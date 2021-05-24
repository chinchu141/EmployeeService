package com.scg.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.employee.dao.EmployeeDao;
import com.scg.employee.feign.DepartmentServiceProxy;
import com.scg.employee.vo.EmployeeVO;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private DepartmentServiceProxy departmentProxy;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {

		return employeeDao.addEmployee(employeeVO);
	}

	@Override
	public List<EmployeeVO> getEmployees() {

		return employeeDao.getEmployees();
	}

	@Override
	public String getAllDepartments() {

		return departmentProxy.getAllDepartments();

	}

}
