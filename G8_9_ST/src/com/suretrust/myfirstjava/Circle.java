package com.suretrust.myfirstjava;

public class Circle extends Shape{
	
	public static void main(String args[]) {
		
		Shape shape= new Circle();
		//area
		System.out.println("area of the circle is:"+3.14*shape.Area(12, 12));
	}

}
