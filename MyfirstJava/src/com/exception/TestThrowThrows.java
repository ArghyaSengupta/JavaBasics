package com.exception;

import java.io.IOException;
import java.util.Scanner;

public class TestThrowThrows extends NestedTryBlock{

	 static void test() throws IOException {
	Scanner sc= new Scanner("abcd\\efgh\\p.txt");//this file is not there
	sc.next();
	}
	
	//caller should also define the IOException
	 void test1() throws IOException {
		
		test();//this has a chance to throw exception
	}
	 
	 public static void validate(int age) {  
	        if(age<18) {  
	            //throw Arithmetic exception if not eligible to vote  
	            throw new ArithmeticException("Person is not eligible to vote");    
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	    }  
	
	//compilation layer
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//caller
		test();
		validate(5);
		//try {
			
			int a[]= new int [5];
			a[90]=123;//exp
			
		//}
		
		//catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.toString());
		//}
	}

}
