package com.hcl.matrimonyapplication.api.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;
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
		user.setUserName("pass");
		mockmvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	
	@Test
	public void loginUserTest() throws Exception {
		Mockito.when(userService.loginUser(Mockito.anyString(), Mockito.anyString())).thenReturn("login success");
		mockmvc.perform(MockMvcRequestBuilders.post("/login").contentType(MediaType.APPLICATION_JSON).accept(MediaType.ALL)
				.content(asJsonString(user)));
		ResponseEntity<String> message = userController.loginUser("1233", "eee");
		assertEquals("login success", message.getBody());
		}
	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
			}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void testRegiter() {
		ResponseEntity<UserDetailDTO> result;
		UserDTO userDto = new UserDTO();
		userDto.setPassword("Anu");
		userDto.setUserId((long) 123);
		userDto.setUserName("Krishna");
		User user = new User();
		user.setPassword("Anu");
		user.setUserId((long) 123);
		user.setUserName("Krishna");
		BeanUtils.copyProperties(user, userDto);
		Mockito.when(userService.registerUser(Mockito.any())).thenReturn(result);
		result = userController.register(userDto);
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


