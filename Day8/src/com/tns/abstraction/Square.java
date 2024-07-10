package com.tns.abstraction;

public class Square extends Shape {
	
	float side;
	
	//constructor 
	public Square() 
	{
		side=2.0f;
	}
	
	public Square(float side) {
		super();
		this.side = side;
	}

	public void calarea() {
		this.area=side*side;
	}
}
