package com.tns.method_overloading;

public class OverLoading {
	
	private float x;
	private float y;
	
	
	public OverLoading() {
	
		x = 0.0f;
		y = 0.0f;
	}
	
	public OverLoading(float x)
	{
		this.x=x;
		this.y=x;
		
	}
	
	public OverLoading (float x, float y)
	{
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
