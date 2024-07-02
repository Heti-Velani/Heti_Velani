package com.tns.MultilevelInheritance;

public class Country {
	
	private String Country;
	private String Countrycapital;
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCountrycapital() {
		return Countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		Countrycapital = countrycapital;
	}
	@Override
	public String toString() {
		return "Country [Country=" + Country + ", Countrycapital=" + Countrycapital + "]";
	}
	
	
}
