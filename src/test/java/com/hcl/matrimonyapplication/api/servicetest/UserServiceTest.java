package com.hcl.matrimonyapplication.api.servicetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.repository.UserRepository;
import com.hcl.matrimonyapplication.api.service.UserServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

	@Mock UserRepository userRepository;
	@InjectMocks UserServiceImpl userServiceimpl;
	
	@Test
	
	public void loginTest() {
		
		User user = new User();
		
	user.setUserId(9999L);
	user.setUserName("venkat");
	user.setPassword("ecity");
		
		
		Mockito.when(userRepository.findByUserName(user.getUserName())).thenReturn(user);
	UserDTO result = userServiceimpl.loginUser(user.getUserName(), user.getPassword());
	assertEquals("Login Successfully....", result);
		
	}
}
