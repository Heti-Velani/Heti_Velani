package com.tns.abstraction;

public class Rectangle extends Shape {
	
	float width;
	float height;
	
	public Rectangle() {
		width=0.2f;
		height=0.3f;
	}
	
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void calarea() {
		this.area=width*height;
	}
}
