package com.hcl.matrimonyapplication.api.service;
/***
 * @author Anuradha
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.BeanUtils;

import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;
import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	@Mock
	UserRepository userRepository;

	@InjectMocks
	UserServiceImpl userServiceImpl;

	@Test
	public void testRegisterUser() {
		
		User user = new User();
		UserDTO userDTO = new UserDTO();
		user.setUserId((long) 123);
		user.setUserName("Anuradha");
		user.setPassword("anu");
		user.setProfileId(1);
		BeanUtils.copyProperties(user, userDTO);
		Mockito.when(userRepository.save(Mockito.any())).thenReturn(user);
		UserDetailDTO result = userServiceImpl.registerUser(userDTO);
		assertNotNull(user);
		assertEquals("SUCCESS", result.getStatus());
	}
}
