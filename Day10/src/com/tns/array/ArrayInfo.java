package com.tns.array;

/* Java array is an object which contains elements of similar data type
 * stored in continuous memory location
 * It makes the code optimized
 * Two types:Single dimensional,multidimensional & jagged array
 */

class ArrayOperations
{
	//print int array
	static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + "\t");//\t provides 6 digit space
			System.out.println();
		}
	}
	
	//variable argument function
	public static int getSum(int... n)
	{
		int sum=0;
		//store the array size in no variable
		for(int no : n)
			sum +=no;
		return sum;
	}
	
	//count no of odd elements
	
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i] % 2!=0)
				count++;
		}
		return count;
	}
	
	//count the no of even elements
	public static int getEvenCount(int b[]) {
		return b.length -getOddCount(b);
	}
}
public class ArrayInfo {

	public static void main(String[] args) {
		
		int n=10;
		int a[];
		a=new int[n];
		
		//displaying the array
		ArrayOperations.printArray(a);
		
		//assigning values in an array a
		for(int i=0; i<a.length;i++)
			a[i]=5*i;
		ArrayOperations.printArray(a);
		
		int b[]= {10,20,30,40,50};//initialization at the time 
		ArrayOperations.printArray(b);
		
		//calling of variable argument function
		System.out.println("Sum of array elements is:" + ArrayOperations.getSum(b));
		System.out.println("Sum of array elements is:" + ArrayOperations.getSum(10,20,30,40,50));
		
		b[2] = 999;//assigning single elements
		
		/*Array Index Out Of Bound Exception(RunTime)
		b[20] = 67;
		ArrayOperations.printArray(b);*/
		
		//display total no of odd and even
		System.out.println("Odd number:"+ ArrayOperations.getOddCount(b) +
				"\t Even no:" + ArrayOperations.getEvenCount(b));
		System.out.println();
		
		
		/*compile time exception 
		 * we can not print an empty array
		int c[];
		System.out.println(c);*/
 
	}

}
