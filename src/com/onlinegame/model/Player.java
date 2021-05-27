package com.onlinegame.model;

public class Player extends User{
	
	int playerId;

	public Player() {
		super();
		this.playerId = 0;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", fName=" + fName + ", lName=" + lName
				+ ", gender=" + gender + ", email=" + email + ", DOB=" + DOB + ", password=" + password + "]";
	}
	
	

}
