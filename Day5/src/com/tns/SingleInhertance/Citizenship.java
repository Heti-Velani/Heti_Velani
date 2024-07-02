package com.tns.SingleInhertance;

public class Citizenship {
	private String name;
	private String adharno;
	private String address;
	private long phoneno;
	
	public Citizenship() {
		System.out.println("Citizens object created");
	}
	
	//Parameterized Constructor(source->Generate constructor using fields)
	public Citizenship(String name, String adharno, String address, long phoneno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.address = address;
		this.phoneno = phoneno;
	}

    //source->Generate Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	//Source->Generate toString()
	@Override
	public String toString() {
		return "Citizenship [name=" + name + ", adharno=" + adharno + ", address=" + address + ", phoneno=" + phoneno
				+ "]";
	}

}
