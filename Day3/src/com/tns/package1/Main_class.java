package com.tns.package1;

//ctrl+shift+o
import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		System.out.println("Enter your name :");
		name = sc.next();
		
		int age;
		System.out.println("Enter age:");
		age = sc.nextInt();
		
		String gender;
		System.out.println("Enter your gender:");
		gender = sc.next();
		
		System.out.println("Enter your income:");
		int income = sc.nextInt();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		
		Tax_Calculation calc=new Tax_Calculation();
		calc.calculateTax(person);
		
	}

}


