package com.scg.employee.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employee.dao.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
