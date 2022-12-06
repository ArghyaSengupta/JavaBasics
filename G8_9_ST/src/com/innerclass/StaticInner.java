package com.innerclass;

public class StaticInner {

	static int data=30;
	static class Inner{
		void msg() {
			System.out.println(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticInner.Inner obj= new Inner();
		obj.msg();
	}

}
