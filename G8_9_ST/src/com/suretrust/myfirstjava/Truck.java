package com.suretrust.myfirstjava;

public class Truck extends Vehicle implements TestInterface{

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "red";
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Mahindra";
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "diesel";
	}

	@Override
	public int mileage() {
		// TODO Auto-generated method stub
		return 20;
	}

	

}
