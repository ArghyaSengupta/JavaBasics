package com.oops.examples;

//childclass=mainclass
//parentclass=Demo-->abstract class
public class Square extends Shapes{

	//this completed the use of the display () 
	//which was abstract
	@Override
	void display(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	
	public static void main(String args[]) {
		
		Square obj=new Square();
		obj.display(10);
		obj.test();
		obj.calculateArea(10,10);
		
	}

	@Override
	int calculateArea(int length,int breadth) {
		// TODO Auto-generated method stub
		System.out.println("Calculating area of Square"+length*breadth);
		return length*breadth;
	}

	

	

	
	

}
