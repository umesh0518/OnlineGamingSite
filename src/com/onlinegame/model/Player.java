package com.onlinegame.model;

public class Player {
	int playerId;
	String fName;
	String lName;
	String gender;
	String email;
	String DOB;
	
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
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
		DOB = dOB;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender
				+ ", email=" + email + ", DOB=" + DOB + "]";
	}
	
	
	

}
