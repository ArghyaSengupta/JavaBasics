package com.innerclass;

public class LocalInner {

	private int data=30;
	
	void display() {
		class Local{
			void msg() {
				System.out.println(data);
			}
		}
		Local l=new Local();
		l.msg();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalInner li=new LocalInner();
		li.display();

	}

}
