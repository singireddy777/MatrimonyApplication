package com.hcl.matrimonyapplication.api.exception;

import java.io.Serializable;

public class UserProfileNotFoundException extends RuntimeException implements Serializable{

	private static final long serialVersionUID = 1L;
	private static final String message = "user id doesn't exist";
	public UserProfileNotFoundException() {
		
		super(message);
	}
}
