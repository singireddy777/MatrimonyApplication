package com.hcl.matrimonyapplication.api.service;

import org.springframework.stereotype.Service;


@Service
public interface UserService {

	public String loginUser(String userId, String password);

}
