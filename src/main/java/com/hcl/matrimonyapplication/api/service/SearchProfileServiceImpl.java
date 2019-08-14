package com.hcl.matrimonyapplication.api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hcl.matrimonyapplication.api.dto.ProfileSuccessResponseDto;
/**
 * 
 * @author Sushil
 *
 */
@Service
public class SearchProfileServiceImpl implements SearchProfileService {
	
	private static final Logger logger = LoggerFactory.getLogger(SearchProfileServiceImpl.class);

	//this method is use to search profile base on age, caste and mothertongue
	@Override
	public ProfileSuccessResponseDto searchProfileByAgeOrCasteOrMotherTongue(int age, String caste,
			String motherTongue) {
		// TODO Auto-generated method stub
		logger.info("inside searchProfileByAgeOrCasteOrMotherTongue method");
		
		return null;
	}
	
	

}
