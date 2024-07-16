package com.portal.user.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.user.userservice.client.DeptRequestDTO;
import com.portal.user.userservice.client.FeignClientInterface;
import com.portal.user.userservice.model.User;
import com.portal.user.userservice.service.UserService;
import com.portal.user.userservice.vo.Department;
import com.portal.user.userservice.vo.UserInfoDTO;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	FeignClientInterface feignClientInterface;

	@GetMapping("getUser")
	public User getUser(@RequestBody Long userId) {
		return userService.getUser(userId);
	}

	@PostMapping("saveUser")
	public User saveUser(@RequestBody User user) {
		return userService.saveData(user);
	}

	@GetMapping("getUserInfo")
	public UserInfoDTO getUserInfo(@RequestBody Long userId) {
		User user = userService.getUser(userId);
		Department department = feignClientInterface.getDepartment(new DeptRequestDTO().builder().deptId(user.getDeptId()).build());
		return new UserInfoDTO().builder().user(user).department(department).build();
	}
}
