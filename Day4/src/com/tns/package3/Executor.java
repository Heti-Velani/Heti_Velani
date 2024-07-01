package com.tns.package3;

import com.tns.package1.Base;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b= new Base();
		
//private default protected members can't access
		b.methodPublic();
      //b.varPublic = 41;
		b.methodPublic();
	}

}
