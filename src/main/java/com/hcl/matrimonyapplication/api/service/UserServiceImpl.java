package com.hcl.matrimonyapplication.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired UserRepository userRepo;
	@Override
	public String loginUser(String userId, String password) {
		
		logger.info("inside the loginUser method in serviceImpl");
		
		User user = userRepo.findById(userId).get();
		
		logger.info("user data : "+user);
		
		if(user!=null) {
			
	         if(user.getUserId().equalsIgnoreCase(userId)&& user.getPassword().equals(password)) {
	
	    return "Login Successfully....";
	        }
	else { 
	       return "something went wrong please try again....";
	}
	}
	return "user doen't exist";
	}
}
