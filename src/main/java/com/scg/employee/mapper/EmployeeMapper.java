package com.scg.employee.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employee.dao.entity.Employee;
import com.scg.employee.vo.EmployeeVO;




//@Mapper(componentModel = "spring")
@Mapper(componentModel = "spring")

public interface EmployeeMapper {
	
	
	EmployeeVO  toVO(Employee employee);
	List<EmployeeVO>  toVO (List<Employee> list);
	Employee toEntity(EmployeeVO employeeVo);
}
