package com.tns.SingleInhertance;

public class Student extends Citizenship {
	
	private int rollno;
	private String collegename;
	
	public Student() {
		super();
	}

	public Student(String name, String adharno, String address, long phoneno,int rollno, String collegename) {
		super(name, adharno,address,phoneno);
		this.rollno = rollno;
		this.collegename = collegename;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhoneno()=" + getPhoneno()
				+ "]";
	}
	
	
	
}
