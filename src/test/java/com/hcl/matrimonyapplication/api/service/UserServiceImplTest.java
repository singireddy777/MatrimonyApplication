package com.hcl.matrimonyapplication.api.service;
/***
 * @author Anuradha
 */
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.matrimonyapplication.api.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl userServiceImpl;

	@Test
	public void testRegisterUser() {
		fail("Not yet implemented");
	}

}
