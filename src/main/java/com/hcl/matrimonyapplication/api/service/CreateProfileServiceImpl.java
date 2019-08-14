package com.hcl.matrimonyapplication.api.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.entity.CreateProfile;
import com.hcl.matrimonyapplication.api.entity.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.repository.CreateProfileRepository;

@Service
public class CreateProfileServiceImpl implements CreateProfileService {

	@Autowired
	private CreateProfileRepository createProfileRepository;
	
	@Override
	public ResponseDTO create (CreateProfileDTO createProfileDTO) {
		// TODO Auto-generated method stub
		CreateProfile creteProfile=new CreateProfile();
		
		ResponseDTO responseDTO=new ResponseDTO();
		
		
// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//String  currentDateTime =formatter.toFormat(createProfileDTO.getDob()); 
	
		BeanUtils.copyProperties(createProfileDTO, creteProfile);
		 createProfileRepository.save(creteProfile);
		 responseDTO.setMessage("Register user");
		 responseDTO.setStatusCode(200);
		 return responseDTO;
		 
		 
	}

}
