package com.tns.array;

import java.util.Arrays;

public class Singledimensionarray {

	public static void main(String[] args) {
		
		//get array
		int intArr[]= {69,20,12,40,35};
		
		//print array in normal format
		System.out.println(Arrays.toString(intArr));
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]+" ");
		}
		System.out.println();
		
		//sort the array
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary search 
		System.out.println(Arrays.binarySearch(intArr,20));
		System.out.println(Arrays.binarySearch(intArr,2,4,35));
		
		int intArr1[]= {69,20,12,40,35};
		System.out.println(Arrays.toString(intArr1));
		
		//comparison
		/*will give both the arrays are not same as the 
		intArr1 is not sorted and inArr is in sorted format*/
		System.out.println(Arrays.toString(intArr));
		
		if(Arrays.compare(intArr, intArr1)==0) {
			System.out.println("Both the arrays are same!!");
		}else {
			System.out.println("Both the arrays are not same");
		}
		
		//copy array
		int intArr2[]=Arrays.copyOf(intArr1, 2);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr,1,4);
		System.out.println(Arrays.toString(intArr3));
		
		//fill method
		Arrays.fill(intArr3,7);
		System.out.println(Arrays.toString(intArr3));
		
		

	}

}
