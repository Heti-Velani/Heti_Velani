package com.tns.MultilevelInheritance;

public class State extends Country{
	
	private String statename;
	private String statelang;
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public String getStatelang() {
		return statelang;
	}
	public void setStatelang(String statelang) {
		this.statelang = statelang;
	}
	@Override
	public String toString() {
		return "State [statename=" + statename + ", statelang=" + statelang + ", getCountry()=" + getCountry()
				+ ", getCountrycapital()=" + getCountrycapital() + "]";
	}
	
	
}
