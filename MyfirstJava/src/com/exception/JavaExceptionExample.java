package com.exception;

public class JavaExceptionExample {
	
 public static void main(String args[]) {
	 int i=50,j=0,data;
	 try {
		 //data=i/j;//gives some unusual value
		 //runtime errors
		 //int data1=50/0;
		 
		 int a[]=new int[5];
		 a[5]=30/0;
	 }
	 
	 catch(ArrayIndexOutOfBoundsException e){
		 System.out.println("Index");
	 }
	 
	 catch(ArithmeticException e){
		 System.out.println(e);
		// int data2=50/0;//exception in catch block cannot be handled.
		 
	 }
	 catch(Exception e) {
		 System.out.println(e.toString());
	 }
	 //block that acts as a flag to check where we are presently executing:finally
	 finally {
		 System.out.println("I am always executed");
	 }
	 
	 System.out.println("rest of the code..");
 }

}
