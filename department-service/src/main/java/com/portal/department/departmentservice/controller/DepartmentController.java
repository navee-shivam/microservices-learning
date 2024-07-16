package com.portal.department.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.department.departmentservice.dto.RequestDTO;
import com.portal.department.departmentservice.model.Department;
import com.portal.department.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("saveDepartment")
	public Department saveDepartment(@RequestBody Department department) {
		return departmentService.save(department);
	}

	@PostMapping("getDepartment")
	public Department getDepartment(@RequestBody RequestDTO requestDto) {
		return departmentService.getDepartment(requestDto.getDeptId());
	}

}
