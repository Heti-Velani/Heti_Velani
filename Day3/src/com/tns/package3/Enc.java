package com.tns.package3;

public class Enc {

	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		
		e.setName("Heti");
		e.setAge(21);
		e.setSerialno(1001);
		
		System.out.println("Serial No :" + e.getSerialno());
		System.out.println("Name :" + e.getName());
		System.out.println("Age :" + e.getAge());
		
		System.out.println(e);
		

	}

}
