package practice;

//Java program to demonstrate execution
//of static blocks and variables

class StaticTest3
{
	// static variable
	static int a = m1();
	int piyush=m1();//??: homework2
	
	// static block
	static {
		a=10;
		//piyush=20;
		System.out.println("Inside static block");
	}
	
	// static method
	static int m1() {
		System.out.println("from m1");
		return 20;
	}
	
	int m2() {
		return 10;
	}
	
	// static method(main !!)
	public static void main(String[] args)
	{
	System.out.println("Value of a : "+a);
	System.out.println("from main");
	}
}

