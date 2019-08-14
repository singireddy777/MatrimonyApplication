package com.hcl.matrimonyapplication.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.matrimonyapplication.api.dto.ResponseDTO;
import com.hcl.matrimonyapplication.api.entity.CreateProfileDTO;
import com.hcl.matrimonyapplication.api.service.CreateProfileService;

@RestController
@RequestMapping("/matrimony")
public class CreateProfileController {
	
	@Autowired
	private CreateProfileService createProfileService ;
	
	@PostMapping("/createProfile")
	public ResponseEntity<ResponseDTO> createprofile(@RequestBody CreateProfileDTO ProfileProfileDTO){
		
		ResponseDTO ResponseDTO=createProfileService.create(ProfileProfileDTO);
		return new ResponseEntity<>( ResponseDTO,HttpStatus.OK);

	}

}