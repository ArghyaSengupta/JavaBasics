package practice;

abstract class Shape {
	abstract void draw();// signature
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

//In real scenario, method is called by programmer or user  
class TestAbstraction {
	public static void main(String args[]) {
		
		//parent class constructor will hold /can hold child class object
		//child class obj is created from child class constructor
		//Shape s = new Circle1();// In a real scenario, object is provided through method, e.g., getShape()
		Shape s1= new Rectangle();//only obj of rectangle class:factory of rectangles
		Shape s2= new Circle1();// method --Factory method
		s1.draw();
		s2.draw();
		//s.draw();
	}
}