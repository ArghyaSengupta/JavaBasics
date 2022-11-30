package com.suretrust.myfirstjava;//pkg name


public class Byke extends Vehicle implements TestInterface{

	int mileage=20;//object1 or variable1
	String brake="1d";//object2 or variable 2
	private int noofwheels=4;
	public static void main(String args[]) {
		
		//v2: vehicle + byke
		//object represents Class and it's properties
		Vehicle v2= new Byke();
		//mileage
	    System.out.println("mileage of byke is"+v2.mileage(20, 2));
	    
	    
		Byke byke= new Byke();
		byke.name();
	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "blue";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Honda";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "petrol";
	}

	@Override
	public int mileage() {
		// TODO Auto-generated method stub
		return 10;
	}
	//is encapsulating the feature
	//using this method i can access it
	public int wheels() {
		return noofwheels;//private: cannot be accessed outside this class
	}

}