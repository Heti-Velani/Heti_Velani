package com.tns.Interface;

/* Interface:
 * Two types of interface:Functional Interface, Marker Interface
 * Functional Interface:interface that has only pure one abstract method.
 * eg:Runnable 
 * Marker Interface:interface that does not contain any methods,fields 
   and any constraints i.e interface is empty
 *eg:Clonable
 */
public class Interface {
	public static void main(String[] args) {
		
		Savingacc s = new Savingacc("Heti","Pune",123456,500000);
		s.deposit(12000);
		System.out.println(s);
	}
}
