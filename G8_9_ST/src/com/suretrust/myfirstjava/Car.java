package com.suretrust.myfirstjava;//pkg name

//is a Vehicle:inheritence
//Car:child, Vehicle :Praent
public class Car extends Vehicle implements TestInterface{

	String object1="color";//Variable or object1
	String brand="Tata";//variable or object 2
	
	//methods are created in child classes: specific to Car(child class)
	/*
	 * void name() //method1 { System.out.println("I am a car"); }
	 * 
	 * int mileage(int mileageofCar)//method2 {
	 * 
	 * return mileageofCar; }
	 * 
	 * int numberOfTyres() { return 4; }
	 */

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "maroon";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "alto";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "petrol";
	}

	@Override
	public int mileage() {
		// TODO Auto-generated method stub
		return 30;
	}
	public static void main(String args[]) {
		
		Vehicle v1= new Car();
		//mileage
		System.out.println("Mileage of car is:"+v1.mileage(12, 4));
	}
	
}
