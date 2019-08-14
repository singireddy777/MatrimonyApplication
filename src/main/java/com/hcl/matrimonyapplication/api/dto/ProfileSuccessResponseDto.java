package com.hcl.matrimonyapplication.api.dto;

import lombok.Data;

/**
 * 
 * @author Sushil
 *
 */
@Data
public class ProfileSuccessResponseDto {

	private int statusCode;
	private String status;
	private String message;
	private CreateProfileResponse profileResponse;
}
