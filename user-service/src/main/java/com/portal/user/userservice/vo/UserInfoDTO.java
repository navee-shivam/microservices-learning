package com.portal.user.userservice.vo;

import com.portal.user.userservice.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDTO {

	private User user;
	private Department department;
	
}
