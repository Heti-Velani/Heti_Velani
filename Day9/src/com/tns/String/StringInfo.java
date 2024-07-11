package com.tns.String;


/*for each loop is used to normally take text from an array
 *String:Group of characters,it is enclosed within single quote or double quote
 *String constant pool area(SCP):when you have same data for 2 variable it will not 
  allocate different memory it will point to same memory in the heap memory.
 *String Buffer:it is mutable so it can be changeable,it is declared final.
                fast and consume less memory when you concat string
                does not override the equals() method of object class*/
public class StringInfo {

	public static void main(StringInfo[] args) {
		
		//initialize String
		char c[]= {'I','n','d','i','a'};
		
		String s1 = new String(c);
		System.out.println(s1);
		
		//Concatenation
		String longstr = "This is to show"+"how long string"+"can be printed";
		System.out.println(longstr);
	}

}
