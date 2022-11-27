package com.oops.examples;


//polymorphism
class Splendor extends Bike{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Bike b = new Splendor(); //right hand side is the child object
	    Bike b1= new Bike();//parent object
	    
	    b.run();//method from the child 
	    b1.run();//method from the parent
	  }  
	}  
