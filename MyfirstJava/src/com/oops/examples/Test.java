package com.oops.examples;

public class Test {
	
	public static void main(String args[]) {
		//read-write encapsulation
		//write only encapsulation
		//1. object of the class
		//2. getter-setter of the class
		//wraps the data of the object
		Student student= new Student();
		//object student encapsulates bothe
		//getter and setter values
		//so when we set a value 
		//and simply call the getter
		//it shows the same value
		//real time value...
		student.setName("Vijay");//one value at a time
		student.setName("Ram");//one value at a time
		System.out.println(student.getName());
	}

}
