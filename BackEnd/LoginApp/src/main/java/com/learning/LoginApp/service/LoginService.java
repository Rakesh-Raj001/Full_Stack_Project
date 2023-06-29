package com.learning.LoginApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.LoginApp.entities.LoginPage;
import com.learning.LoginApp.entities.User;
import com.learning.LoginApp.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	private UserRepository userRepo;
	
	public User getUser(LoginPage loginData){
		return userRepo.findByEmail(loginData.getEmail());
	}

}