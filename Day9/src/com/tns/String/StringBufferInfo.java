package com.tns.String;

public class StringBufferInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string buffer length vs capacity
		//default buffer capacity is 16
		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println("Buffer=" + buffer);
		System.out.println("Length=" + buffer.length());
		System.out.println("Capacity=" + buffer.capacity());//so here 16+5=21
		
		//appending and inserting to buffer
		String s;
		int a=42;
		buffer= new StringBuffer(40);
		//to string will return s object
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		
		buffer = new StringBuffer("I Java!");
		buffer.insert(2, "like ");
		System.out.println(buffer);
		
		buffer.delete(3,  6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
		

	}

}
