package com.onlinegame.model;

public class User {
	private static final int NULL = 0;
	int userId;
	String fName;
	String lName;
	String gender;
	String email;
	String DOB;
	String password;
	
	
	public User() {
		super();
		this.userId = NULL;
		this.fName = "";
		this.lName = "";
		this.gender = "";
		this.email = "";
		this.DOB = "";
		this.password = "";
	}

	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		this.DOB = dOB;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender
				+ ", email=" + email + ", DOB=" + DOB + "]" + ", password=" + password + "]";
	}
	
	
	

}
