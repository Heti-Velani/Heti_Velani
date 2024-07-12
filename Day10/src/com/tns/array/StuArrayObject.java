package com.tns.array;

public class StuArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr;
		
		//declared memory for 5 objects of type students
		arr=new Student[5];
		
//		for(int i=0; i<arr.length; i++)
//			System.out.println("Elements at"+i+":"+arr[i].getRollNo()+
//					" "+arr[i].getName());
		
		arr[0] = new Student(1,"Heti");
		arr[1] = new Student(2,"Asiya");
		arr[2] = new Student(3,"Gayatri");
		arr[3] = new Student(4,"Pallavi");
		arr[4] = new Student(5,"Esha");
		

	}

}
