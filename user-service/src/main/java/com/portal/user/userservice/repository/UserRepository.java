package com.portal.user.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portal.user.userservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
