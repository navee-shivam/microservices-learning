package com.employee.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("getEmployee")
	public Employee getEmployee() {
		return Employee.builder().id(1).name("naveen").build();
	}
}
