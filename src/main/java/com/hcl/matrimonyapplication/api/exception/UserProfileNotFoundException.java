package com.hcl.matrimonyapplication.api.exception;

public class UserProfileNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UserProfileNotFoundException(String message) {
		
		super(message);
	}
}
