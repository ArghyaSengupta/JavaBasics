package com.innerclass;

public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//abstract inner class: anonymous class
		Person p= new Person() {
			public void dance() {
				System.out.println("dancine");
			}
		};//abstract class
		
		p.dance();
	}

}
