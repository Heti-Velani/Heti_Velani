package com.tns.day1;

public class Primitive_data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte - 1 byte(8 bits)
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte is " + byteMin + "  Max range of byte is :"+ byteMax);
				
		//short - 2 bytes (16 bits)
		short shortMax= 32767;
		short shortMin= -32768;
        System.out.println("Min range of short is " + shortMin + "  Max range of short is :"+ shortMax);
				
		//int - 4 bytes(32 bits)
		int minInt = -2147483648;
		int maxInt = 2147483647;
		System.out.println("Min range of int is " + minInt + "  Max range of int is :"+ maxInt);
				
		//long - 8 bytes(64 bits)
		long maxLong=9223372036854775807L;
		long minLong=	-9223372036854775808L;
		System.out.println("Min range of long is " + minLong + "  Max range of long is :"+ maxLong);
				
		//float - 4 bytes(32 bits)		
		float f=3234.141243278345f;
		//double - 8 bytes(64 bits)
		double d= 3456.14124512345678902345678914f;
		System.out.println("float value is " + f+ " double value " + d);
				
		//boolean - 1 bit
		boolean  flag= false;
		System.out.println("boolean value is "+flag);

	}

}
