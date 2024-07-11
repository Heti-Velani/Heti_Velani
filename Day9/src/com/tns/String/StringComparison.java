package com.tns.String;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating string using literals pool memory
		//here it will not allocate different memory for s1 and s2 it will point to same memory
		String s1 = "abc";
		String s2 = "abc";
		
		//create new string operator heap memory 
		//here it will allocate new memory for both s3 and s4
		String s3 =new String("abc");
		String s4 =new String("abc");
		
		//== object reference
		// .equals() compare the data
		System.out.println("Case1:" + (s1==s2));//true as the reference is same
		System.out.println("Case2:" + (s1==s3));
		System.out.println("Case3:" + (s2.equals(s1)));
		System.out.println("Case4:" + (s2.equals(s4)));
		System.out.println("Case5:" + (s3==s4));//false as the reference is different
		System.out.println("Case6:" + (s3.equals(s4)));
		
		//check hashcode (value is based on the string given as input)
		//hash value of empty string is zero
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compare to will not return true and false it gives difference between the unicode value.
		System.out.println(s1.compareTo("abc"));
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s4));
		
		
		
		
	}

}
