package com.hcl.matrimonyapplication.api.dto;

import java.util.List;

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
	private List<CreateProfileResponse> profileResponse;
}
