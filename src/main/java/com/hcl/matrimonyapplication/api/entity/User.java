package com.hcl.matrimonyapplication.api.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author venkat
 *
 */
@Entity

public class User {
	
private static final Logger logger = LoggerFactory.getLogger(User.class);

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "profile_id")
	private long profileId;
	
	@Column(name = "password")
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getUserId() {
		
		logger.info("inside the User entity");
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", profileId=" + profileId + ", password="
				+ password + "]";
	}
}
