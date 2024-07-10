package com.tns.staticmethod;

public class Mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass.display();
		
		Myclass c1 = new Myclass();
		System.out.println(c1);
		
		Myclass.display();
		
		Myclass c2 = new Myclass();
		System.out.println(c2);
		
		Myclass.display();
	}

}
