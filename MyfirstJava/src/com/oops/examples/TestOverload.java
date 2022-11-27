package com.oops.examples;

public class TestOverload {

	public static void main(String args[]) {
		
		Sum sum= new Sum();
		System.out.println(sum.add(1, 2));
		System.out.println(sum.add(1.0, 2.0, 3.0));
		System.out.println(sum.add(1, 2, 3));
	}
	
}
