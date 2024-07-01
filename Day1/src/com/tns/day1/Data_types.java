package com.tns.day1;

public class Data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//char data type
		char ch='a';
		System.out.println(ch);
		
		char ch1 = 65;//this will return the char at the ascii value 65
		System.out.println(ch1);
	
		char var1= '\u00A7'; //unicode assigning
		System.out.println(var1);
		
		char var2='\u20AC';
		System.out.println(var2);
		
		//int data type
		int a='B';//will return the ascii value of B
		System.out.println(a);
		
        int value1 = 9 / 2; 
        System.out.println(value1);
		
        //float data type
		float value2 = 101f /61f;
		System.out.println(value2);
		
		float value3= 5/2f;
		System.out.println(value3);
		
		//double data type
		double value4 = 10d/6d;
		System.out.println(value4);
		
		
		int radius=10;
		//assigning expression to variable
		double percentage =3.14 * radius  * radius;
		System.out.println("Percentage : "+ percentage);
	}

}
