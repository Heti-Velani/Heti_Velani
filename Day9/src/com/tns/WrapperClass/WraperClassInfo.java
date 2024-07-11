package com.tns.WrapperClass;

/*wrapper class provide a way to use primitive data types as objects
 *Class that wraps a primitive data into an objects is called as wrapper class
 *WRAPPING:
 *int x=25;
  Integer iWrap = new Integer(x);
 *UNWRAPPING:
 *int unWrapped = iWrap.intValue();
 */
public class WraperClassInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//unboxing
		Integer i = new Integer(10);
		System.out.println(i);
		
		int b=i.intValue();
		System.out.println(b);
		
		int c=i;
		System.out.println(c);
		
		//autoboxing
		int a=100;
		Integer i1=a;
		System.out.println(i1);

	}

}
