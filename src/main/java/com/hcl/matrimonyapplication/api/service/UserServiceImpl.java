package com.hcl.matrimonyapplication.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.UserDTO;
import com.hcl.matrimonyapplication.api.dto.UserDetailDTO;
import com.hcl.matrimonyapplication.api.entity.User;
import com.hcl.matrimonyapplication.api.exception.UserProfileNotFoundException;
import com.hcl.matrimonyapplication.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO loginUser(String userName, String password) {

		logger.info("inside the loginUser method in serviceImpl");

		UserDTO userDTO = null;

		User user = userRepository.findByUserName(userName);

		if (user != null) {

			if (user.getUserName().equalsIgnoreCase(userName) && user.getPassword().equals(password)) {

				userDTO = new UserDTO();

				userDTO.setStatusCode(200);
				userDTO.setStatusMessage("SUCCESS");
				userDTO.setProfileId(user.getProfileId());
				userDTO.setUserId(user.getUserId());

				return userDTO;
			} else {
				throw new UserProfileNotFoundException("This user " + userName + " does not exits");
			}
			
		
		}
		else {
			throw new UserProfileNotFoundException("This user " + userName + " does not exits");
		}

	}

	@Override
	public UserDetailDTO registerUser(UserDTO userDto) {
		logger.info("INSIDE REGISTER ---SERVICE");
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		User user1 = userRepository.save(user);
		UserDetailDTO userDetailsDto = new UserDetailDTO();
		userDetailsDto.setProfileId(user1.getProfileId());
		userDetailsDto.setStatusCode(200);
		userDetailsDto.setMessage("SUCCESS");
		return userDetailsDto;
	}
}
