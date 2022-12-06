package com.innerclass;

//anonymous class using a abstract class
public class AnonymoursInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//referring from constructor of abstract class
		TestAbstract t= new TestAbstract() {
			
			@Override
			void m1() {
				// TODO Auto-generated method stub
				System.out.println("I am here");
			}
		};
		t.m1();
	}

}
