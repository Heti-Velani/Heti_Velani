 package com.tns.package1;

public class Base {
	int varDefault = 10;
	public int varpublic = 20;
	private int varprivate = 30;
	protected int varprotected = 40;
	
	void methodDefault()
	{
		System.out.println(" This is default access basic class");
		System.out.println("Default Variable:" + varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println(" This is public access basic class");
		System.out.println("Public Variable:" + varpublic);
	}
	
	private void methodPrivate()
	{
		System.out.println(" This is private access basic class");
		System.out.println("Private Variable:" + varprivate);
	}
	
	protected void methodProtected()
	{
		System.out.println(" This is protected access basic class");
		System.out.println("Protected Variable:" + varprotected);
	}
	
	
}
