package com.hcl.matrimonyapplication.api.dto;

import lombok.Data;

/**
 * 
 * @author Sushil
 *
 */
@Data
public class CreateProfileResponse {
	
	private String name;
	private String profession;
	private String annualIncome;
	private String mobileNo;
	private String address;

}
