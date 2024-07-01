package com.tns.day2;

public class Continue_Statment {

	public static void main(String[] args) {
		
		for (int k=2; k<15; k++)
		{
			//odd no are skipped
			
			if (k%2 !=0)
				continue;
			//Even number are printed 
			System.out.println(k + "");
		}

	}

}
