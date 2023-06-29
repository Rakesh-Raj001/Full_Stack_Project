package com.learning.LoginApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.LoginApp.entities.User;
import com.learning.LoginApp.repository.UserRepository;
@Service
public class UserService {
@Autowired
	private UserRepository userRepository;
 
	
	public User signUp (User newuser){
		return userRepository.save(newuser);
		
		
	}
	
}

