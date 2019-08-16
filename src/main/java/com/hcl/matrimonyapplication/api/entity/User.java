package com.hcl.matrimonyapplication.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;

@Entity
@Data
public class User {

	private static final Logger logger = LoggerFactory.getLogger(User.class);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long profileId;	
	private Long userId;
	private String userName;
	private String password;

}
