package com.example.lctClientBackend.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.lctClientBackend.models.User;
import com.example.lctClientBackend.models.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);
	
	

}
