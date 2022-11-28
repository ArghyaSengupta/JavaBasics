package com.suretrust.myfirstjava;//package name

//parent class: top parent class
//class= objects + behaviours using those objects
//tyres=2/4/6
//fuel=p/d
//mileage(){
//
public class Vehicle {
	
	String vehicle1="car";//variables or objects :properties
	String vehicle2="byke";//variables or objects:properties

	//method: similar type of functionality inside a block
	
	//below are the behaviours: created using properties
	//no return type of the method
	//parent class : Car and Byle are the children classes
	
	void nameOfVehicle() {
		System.out.println("car");
		System.out.println("byke");
	}
	
	//behave?
	//sum operation :add 2 numbers
	//return a number as per the logic
	//num1:10
	//num2=20
	/*
	 * int substract(int number1,int number2) { if(number1>number2) return number1 -
	 * number2;
	 * 
	 * else return number2-number1; }
	 */
	
	//behaviour : fueltype and numberoftyres
	int mileage(int numberoftyres,String fuel) {
		
		if(numberoftyres==2&&fuel=="petrol")
			
			return 10;
		
		else
			return 20;
	}
}
