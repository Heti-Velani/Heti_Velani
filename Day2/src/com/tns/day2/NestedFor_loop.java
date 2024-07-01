package com.tns.day2;

public class NestedFor_loop {

	public static void main(String[] args) {
		
		
		int b=10;
		int e=20;
		
		for(int  i=b; i <=e; i++ )
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
				
			}
			
			System.out.println();
		}
		

	}

}
