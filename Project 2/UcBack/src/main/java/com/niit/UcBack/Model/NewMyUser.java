package com.niit.UcBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class NewMyUser 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	
	@Column(unique=true,nullable=false)
	private String password;
	
	@Column(unique=true)
	private String logInName;
	
	@Column(unique=true,nullable=false)
	private String emailId;
	
	@Column(unique=true,nullable=false)
	private String phoneNo;
	
	@Column(nullable=false)
	private String role;
	
	@Column
	boolean onlineStatus;
	
	
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogInName() {
		return logInName;
	}

	public void setLogInName(String logInName) {
		this.logInName = logInName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(boolean onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	
	
	
	

}
