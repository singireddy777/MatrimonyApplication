package com.hcl.matrimonyapplication.api.dto;

import lombok.Data;

/***
 * @author Anuradha
 */
@Data
public class UserDetailDTO {
	private static final long serialVersionUID = -1855263580038277712L;
	
	private Integer statusCode;
	private String status;
	private String message;
	private Long profileId;	
}

