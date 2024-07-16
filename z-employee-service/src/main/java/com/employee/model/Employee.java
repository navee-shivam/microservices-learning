package com.employee.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

	private Integer id;
	private String name;
	private String address;
}
