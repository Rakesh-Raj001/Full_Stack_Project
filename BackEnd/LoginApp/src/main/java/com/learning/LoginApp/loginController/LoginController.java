package com.learning.LoginApp.loginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.LoginApp.entities.LoginPage;
import com.learning.LoginApp.entities.User;
import com.learning.LoginApp.service.LoginService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/v1")
public class LoginController {
  
	@Autowired
	private LoginService loginService;
	@PostMapping("/login")
	public ResponseEntity<?> getLoggedIn(@RequestBody LoginPage loginData){
		User user=loginService.getUser(loginData);
		if(user.getPassword().equals(loginData.getPassword()))
	        return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	
	}
	
}