package com.tns.finalmethod;

public class FinalVariable {
	
	//final int x;  //final instance variable must be initialized 
	
		final int x=100;
		
		//declare a static blank final variable
		final static int y;
		
		//Declare and initialize static final variable 
		final static int z = 10;
		
		//instance method 
		void change() {
//			x=30; //final variables can't be reassigned 
//			y=200; //final static variables can't be reassigned 
		}
		
		@Override
		public String toString() {
			return "FinalVarible [x=" + x + ", y=" + y +"]";
		}
		
		//declare a static block to initialize the final static variable ---- y
		static {
			y=20;
			//z=100;// once initialized can't be reassigned 
			System.out.println("Value of Y :" + y);
		}
}
