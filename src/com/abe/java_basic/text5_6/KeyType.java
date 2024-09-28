package com.abe.java_basic.text5_6;

public enum KeyType {
	PADLOCK(1024),
	BUTOON(10000),
	DIAL(30000),
	FINGER(1000000);
	
	private final int requiredAttempts;
	
	KeyType(int requiredAttempts){
		this.requiredAttempts = requiredAttempts;
	}

	public int getRequiredAttempts() {
		return requiredAttempts;
	}
	
	

}
