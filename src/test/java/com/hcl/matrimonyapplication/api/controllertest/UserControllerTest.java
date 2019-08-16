package com.hcl.matrimonyapplication.api.controllertest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.matrimonyapplication.api.controller.UserController;
import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;
import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.service.UserServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@Mock UserServiceImpl userService;
	@InjectMocks UserController userController;
	
	
	private MockMvc mockmvc;
	User user;
	@Before
	public void setUp() {
		user = new User();
user.setUserId(787L);
user.setUserName("venkay");
user.setPassword("password");
		mockmvc = MockMvcBuilders.standaloneSetup(userController).build();	
	}
	@Test
	public void loginUserTest() throws Exception{
		
		UserDTO userDTO = new UserDTO();
		userDTO.setProfileId(97773L);
		userDTO.setUserId(878);
		//userDTO.setUserName("vensee");
		//userDTO.setPassword("password");
		
		Mockito.when(userService.loginUser(Mockito.anyString(),Mockito.anyString())).thenReturn(userDTO);
		
		mockmvc.perform(MockMvcRequestBuilders.post("/matrimony/login").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.ALL).content(asJsonString(user)));
		ResponseEntity<UserDTO> message = userController.loginUser("12345", "password");
		assertEquals(200, message.getStatusCodeValue());
	}
	public static String asJsonString(final Object object) {
		try {
			return new ObjectMapper().writeValueAsString(object);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
}}
