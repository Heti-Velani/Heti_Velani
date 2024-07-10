package com.tns.abstraction;

public class Shapemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s =new Square();
		s.calarea();
		s.show();
		
		Rectangle r = new Rectangle();
		r.calarea();
		r.show();
		
		//dynamic binding or late or lazy binding
		
		Shape s1;
		s1 = new Square(0.5f);
		s1.calarea();
		s1.show();
		
		s1=new Rectangle(10f,7f);
		s1.calarea();
		s1.show();
		
	}

}
