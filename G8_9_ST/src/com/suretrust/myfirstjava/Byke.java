package com.suretrust.myfirstjava;//pkg name


public class Byke extends Vehicle implements TestInterface{

	int mileage=20;//object1 or variable1
	String brake="1d";//object2 or variable 2
	public static void main(String args[]) {
		
		Vehicle v2= new Byke();
		//mileage
	    System.out.println(v2.mileage(20, 2));
	    
	    
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

}