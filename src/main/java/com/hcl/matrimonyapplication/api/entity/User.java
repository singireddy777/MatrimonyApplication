package com.hcl.matrimonyapplication.api.entity;
/***
 * @author Anuradha
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

	private String userId;
	private String password;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long profileId;
}
