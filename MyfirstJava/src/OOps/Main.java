package OOps;

//Java Program to Illustrate Copy Constructor

//Class 1
class Main2 {

	// Class data members
	private double re, im;

	// Constructor 1
	// Parameterized constructor
	public Main2(double re, double im)
	{

		// this keyword refers to current instance itself
		this.re = re;
		this.im = im;
	}

	// Constructor 2
	// Copy constructor
	Main2(Main2 c)
	{

		System.out.println("Copy constructor called");

		re = c.re;
		im = c.im;
	}

	// Overriding the toString() of Object class
	@Override public String toString()
	{

		return "(" + re + " + " + im + "i)";
	}
}

//Class 2
//Main class
public class Main {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of above class
		Main2 c1 = new Main2(10, 15);

		// Following involves a copy constructor call
		Main2 c2 = new Main2(c1);

		// Note: Following doesn't involve a copy
		// constructor call
		// as non-primitive variables are just references.
		Main2 c3 = c2;

		// toString() of c2 is called here
		System.out.println(c2);
		System.out.println(c3);//reference called here
	}
}
