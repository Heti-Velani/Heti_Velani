package com.tns.package3;

public class Encapsulation {
	private int serialno;
	private int age;
	 private String name;
	public int getSerialno() {
		return serialno;
	}
	public void setSerialno(int serialno) {
		this.serialno = serialno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Encapsulation [serialno=" + serialno + ", age=" + age + ", name=" + name + "]";
	}
	 
	 
}
