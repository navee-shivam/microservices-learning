package com.portal.user.userservice.client;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.portal.user.userservice.vo.Department;

@FeignClient(name = "department-service", url = "http://localhost:8081/department")
@LoadBalancerClient
public interface FeignClientInterface {

	@PostMapping( "getDepartment")
	public Department getDepartment(@RequestBody DeptRequestDTO deptId);

}
