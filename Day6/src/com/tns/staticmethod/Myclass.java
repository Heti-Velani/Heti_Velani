package com.tns.staticmethod;

public class Myclass {
	
	//non-static or instance variable
	private int section; 
	
	//static or class variable
	private static int Srno;
	
	//static block
	static {
		System.out.println("This is a static block ");
		//section=23; in static we can not assign value to non static variable
		Srno=100;
	}
	
	Myclass(){
		System.out.println("Within the default constructor");
		Srno++;
		section++;
	}

	@Override
	public String toString() {
		return "Myclass [serialNo=" + Srno + "section=" + section + "]";
	}
	
	//static method
	static void display() {
		
		//System.out.println("Section:" + section);//can not access non static member to static method
		System.out.println("Srno:" + Srno);
	}
}
