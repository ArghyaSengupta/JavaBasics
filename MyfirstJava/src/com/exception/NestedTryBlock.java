package com.exception;
public class NestedTryBlock {
	
	public static void main(String args[]) {
	
		//out try block
		try {
		
			//inner try block -1
		try{
		
			System.out.println("");
			int b=39/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("after first inner try");
		}
		
		//inner try block -2
		try {
			int a[]= new int[5];
			a[5]=4;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("after 2nd inner try");
		}
		System.out.println("sample");
	}
	
	catch(Exception e) {
		System.out.println("out block");
	}
	
	System.out.println("normal flow..");

}

}
