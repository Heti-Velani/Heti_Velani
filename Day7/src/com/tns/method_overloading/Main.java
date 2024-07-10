package com.tns.method_overloading;

public class Main {

	public static void main(String[] args) {
			
			System.out.println("-------Constructor Overloading ---------");

			
			OverLoading p = new OverLoading();  //default
			System.out.println(p);
			
			OverLoading p1=new OverLoading(14.5f);
			System.out.println(p1);
			
			OverLoading p2=new OverLoading(12.5f, 20.50f);
			System.out.println(p2);
			
			System.out.println("---------------Method OverLoading----------- ");
			System.out.println("Addition of two integers "+ MethodOverLoading.addition(5, 100));
			System.out.println("Addition of two float "+ MethodOverLoading.addition(5.5f, 99.9999f));
		
			System.out.println("Addition of two String "+ MethodOverLoading.addition("5", "100"));

			System.out.println("Addition of three no: "+ MethodOverLoading.addition(5, 2, 10));
		}

}
