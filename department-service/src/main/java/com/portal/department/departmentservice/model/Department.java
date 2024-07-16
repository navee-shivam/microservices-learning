package com.portal.department.departmentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "department")
@Data
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENT_SEQ")
	@SequenceGenerator(sequenceName = "seq_department", allocationSize = 1, name = "DEPARTMENT_SEQ")
	private Long id;
	
	@Column(name = "deptname")
	private String deptName;
	
	@Column(name = "deptcode")
	private String deptCode;
}
