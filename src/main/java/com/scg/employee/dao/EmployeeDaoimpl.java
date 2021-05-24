package com.scg.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employee.dao.repository.EmployeeRepository;
import com.scg.employee.mapper.EmployeeMapper;
import com.scg.employee.vo.EmployeeVO;


@Component
public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {
	
		return employeeMapper.toVO(employeeRepository.save(employeeMapper.toEntity(employeeVO)));

	}

	
	@Override
	public List<EmployeeVO> getEmployees() {
		return employeeMapper.toVO(employeeRepository.findAll());
		

	}

	

}
