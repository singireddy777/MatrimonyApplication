package com.hcl.matrimonyapplication.api.dto;
/***
 * @author Venkat
 */
import lombok.Data;

@Data
public class UserDTO {
	
	private long  userId;
	private long profileId;
	private String userName;
	private String password;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
@Override
public String toString() {
	return "UserDTO [userId=" + userId + ", profileId=" + profileId + ", userName=" + userName + ", password="
			+ password + "]";
}

}
