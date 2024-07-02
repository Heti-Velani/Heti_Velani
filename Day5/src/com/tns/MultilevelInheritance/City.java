package com.tns.MultilevelInheritance;

public class City extends State{
	
	private  String Cityname;
	private float Cityarea;
	public String getCityname() {
		return Cityname;
	}
	public void setCityname(String cityname) {
		Cityname = cityname;
	}
	public float getCityarea() {
		return Cityarea;
	}
	public void setCityarea(float cityarea) {
		Cityarea = cityarea;
	}
	@Override
	public String toString() {
		return "City [Cityname=" + Cityname + ", Cityarea=" + Cityarea + ", getStatename()=" + getStatename()
				+ ", getStatelang()=" + getStatelang() + ", getCountry()=" + getCountry() + ", getCountrycapital()="
				+ getCountrycapital() + "]";
	}
	
	
}
