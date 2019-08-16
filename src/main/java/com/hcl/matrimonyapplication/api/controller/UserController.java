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

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;

/***
 * 
 * @author Anuradha
 *
 */
@RestController
@RequestMapping("/matrimony")
@CrossOrigin(origins = "*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public ResponseEntity<UserDetailDTO> register(@RequestBody UserDTO userDto) {
		logger.info("INSIDE REGISTER METHOD--Controller!!!!!!!!!!!!!!!!!!");
		UserDetailDTO user = userService.registerUser(userDto);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<UserDetailDTO> loginUser(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		logger.info("inside controller method");
		return new ResponseEntity<UserDetailDTO>(userService.loginUser(userName, password), HttpStatus.OK);

	}
}
