package com.innerclass;

public class Outer {

	private int data=30;
	void display() {
		class LocalInner{
			
			void msg() {
				System.out.println(data);
			}
		}
		//scope is inside the method
		LocalInner l= new LocalInner();
		l.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Outer li= new Outer();
 li.display();
	}

}
