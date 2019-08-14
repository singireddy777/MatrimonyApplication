package com.hcl.matrimonyapplication.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;
import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.repository.UserRepository;

/***
 * 
 * @author Anuradha
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetailDTO registerUser(UserDTO userDto) {
		logger.info("INSIDE REGISTER ---SERVICE");
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		User user1 = userRepository.save(user);
		UserDetailDTO userDetailsDto = new UserDetailDTO();
		userDetailsDto.setProfileId(user1.getProfileId());
		return userDetailsDto;
	}

}
