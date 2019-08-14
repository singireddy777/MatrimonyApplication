package com.hcl.matrimonyapplication.api.service;

import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.entity.CreateProfileDTO;

@Service
public interface CreateProfileService {
	
	public ResponseDTO create(CreateProfileDTO createProfileDTO);

}
