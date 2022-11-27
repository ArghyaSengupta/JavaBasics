package com.oops.examples;

public class Enfield extends Bike{
	void run(){System.out.println("running safely with 80km");}  
	public static void main(String args[]){  
	    Bike b = new Enfield(); //right hand side is the child object
	    Bike b1= new Bike();//parent object
	    
	    b.run();//method from the child 
	    b1.run();//method from the parent
	  }  


}
