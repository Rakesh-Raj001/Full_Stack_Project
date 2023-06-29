package com.learning.LoginApp.entity.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.LoginApp.entities.User;
import com.learning.LoginApp.service.UserService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")

public class UserController {
	
	
	    @Autowired
	    UserService userService;


	    @PostMapping("/register")
	    public ResponseEntity<?> signUp(@RequestBody User newuser)
	    {
	        try
	        {
	            User user= userService.signUp(newuser);
	     return ResponseEntity.ok(user);
	        }
	        catch(Exception ex)
	        {
	            return new ResponseEntity<String>("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	        
	    }
	    
	    }


