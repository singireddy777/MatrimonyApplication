package com.hcl.matrimonyapplication.api.controller;

import static org.junit.Assert.fail;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.service.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	@Mock
	UserServiceImpl userService;
	
	@InjectMocks
	UserController userController;
	
	private MockMvc mockmvc;
	User user;
	
	@Before
	public void setUp() {
		user = new User();
		user.setPassword("Venky");
		user.setUserId("123");
		user.setPassword("pass");
		mockmvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	
	@Test
	public void loginUserTest() throws Exception {
		mockmvc.perform(MockMvcRequestBuilders.post("/login").contentType(MediaType.APPLICATION_JSON).accept(MediaType.ALL)
				.content(asJsonString(user)));
		}
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
			}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


