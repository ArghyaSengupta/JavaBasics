package com.oops.examples;

public abstract class Shapes {
	
	int size=10;
	int weight=20;
	int cost=90;
	//abstract method : abstraction
	//abstract methods are incomplete
	//child class completes it
	abstract int calculateArea(int length,int breadth);
	abstract void display(int a);//defined in the child class
	//method name
	//method signature
	//cannot have a method body

	//non abstract method
	int test() {
		System.out.println("I am in a non abstract method");
		return 10;
	}
}
