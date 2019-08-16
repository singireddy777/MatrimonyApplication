package com.hcl.matrimonyapplication.api.dto;

import lombok.Data;

/***
 * @author Anuradha
 */
@Data
public class UserDetailDTO {
	private static final long serialVersionUID = -1855263580038277712L;

	
	private int statusCode;
	private String message;
	private long  userId;
	private String userName;
	private String password;
	private Long profileId;
		
}

