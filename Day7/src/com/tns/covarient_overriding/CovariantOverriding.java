package com.tns.covarient_overriding;

/*in method overriding you can make changes in the method but you cannot 
change the return type of an overridden method so for this we have covariant method*/
//if you do not use Covariant method then every time you will have to do type casting

class Colour //parent class
{
	protected Colour getColour()
	{
		Colour c = new Colour();//object 
		return c; //returning the reference
	}
}

//you can change the logic but cannot change the return type
 class Red extends Colour //child class
 {
	 protected Red getColour()//overridden method
	 {
		 Red c = new Red();//same reference of parent class
		 return c;
	 }
 }
 
 class Yellow extends Colour //child class
 {
	 protected Yellow getColour()//overridden method
	 {
		 Yellow c = new Yellow();
		 return c;
	 }
 }
 
 
public class CovariantOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colour c1 = new Colour();
		System.out.println(c1.getColour());
		
		Red r = new Red();
		System.out.println(r.getColour());

	}

}
