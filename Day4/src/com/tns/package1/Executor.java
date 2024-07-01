package com.tns.package1;

public class Executor {

	public static void main(String[] args) {
		
		Base b = new Base();
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		b.varDefault=11;
		b.methodDefault();
		
		b.varprotected=21;
		b.methodProtected();
		
		b.varpublic=31;
		b.methodPublic();
		
		//check the instance of operator
		System.out.println(b instanceof Base);
		
		
	}

}
