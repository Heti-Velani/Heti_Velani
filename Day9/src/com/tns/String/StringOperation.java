package com.tns.String;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ( " India ");
		System.out.println(s1);
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(1,7));
		
		System.out.println(s1.trim());//if you do not provide anything it will trim blank spaces
		
		System.out.println(s1.stripTrailing());//removes the last whitespace and not the front space
		
		System.out.println(s1.isEmpty());
		

	}

}
