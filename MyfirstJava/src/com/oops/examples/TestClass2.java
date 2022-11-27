package com.oops.examples;

public class TestClass2 {

	public static void main(String args[]) {
		
		Cat cat= new Cat();
		cat.eat();//method name is same
		//eat () of cat is overriding the eat() of dog
		Dog dog = new Dog();
		dog.eat();//method name is same
		//but eat() of dog is overriding eat() of cat	
		}
}
