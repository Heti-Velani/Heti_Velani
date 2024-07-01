package com.tns.package1;
 /*by using the getter and setter method you can access 
   the private members from the class*/

/* when you will create an object for this person class 
 * at that time memory will be allocated to it*/

public class Person{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	//private variables can be accessed only inside the class
	private String name;
	private int income;
	private String gender;
	private int age;
	private int tax;
	@Override
	public String toString() {
		return "person [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
}

