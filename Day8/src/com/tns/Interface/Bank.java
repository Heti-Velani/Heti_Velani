package com.tns.Interface;

public interface Bank {
	
	final static float Minbalance=5000;//this will not be change for anyone
	final static float deposit_limit=25000;//dep limit is 25000 per day
	
	//two abstract method declaration
	public void deposit(float amount);
	public void withdraw(float amount);
	
	
	
}
	
