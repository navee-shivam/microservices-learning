package com.portal.user.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.user.userservice.model.User;
import com.portal.user.userservice.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveData(User user) {
		log.info("Save data processing in service layer");
		return userRepository.save(user);
	}

	public User getUser(Long userId) {
		log.info("Fetch userData procesing in service layer");
		Optional<User> user = userRepository.findById(userId);
		return user.isPresent() ? user.get() : null;
	}
}
