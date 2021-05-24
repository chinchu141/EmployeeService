package com.scg.employee.feign;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "DepartmentService", url = "http://localhost:8080")
public interface DepartmentServiceProxy {

	@GetMapping("department/lists")
	String getAllDepartments();

}
