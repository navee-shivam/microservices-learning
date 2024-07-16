package com.portal.department.departmentservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.department.departmentservice.model.Department;
import com.portal.department.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	public Department getDepartment(Long departmentId) {
		Optional<Department> department = departmentRepository.findById(departmentId);
		return department.isPresent() ? department.get() : null;
	}

}
