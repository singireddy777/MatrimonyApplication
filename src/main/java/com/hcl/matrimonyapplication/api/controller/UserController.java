package com.hcl.matrimonyapplication.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.matrimonyapplication.api.service.UserService;

@RestController
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired UserService userService;
	
	@PostMapping("/login")
	
	public ResponseEntity<String> loginUser(@RequestParam("userId")  String userId, @RequestParam ("password") String password) {
		logger.info("inside controller method");
		return new ResponseEntity<String>(userService.loginUser(userId, password), HttpStatus.OK);	
	}
}
