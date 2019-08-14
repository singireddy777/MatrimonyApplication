package com.hcl.matrimonyapplication.api.dto;
/***
 * @author Anuradha
 */
import lombok.Data;

@Data
public class UserDTO {
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", password=" + password + "]";
	}
	
}
