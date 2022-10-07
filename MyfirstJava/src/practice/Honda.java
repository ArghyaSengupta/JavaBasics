package practice;

abstract class Bike{
//parent {
	abstract void run();//names-no value defn:b1
	abstract int mileage();//characteristic:b2
	int fuelquantity;//characteristic:property
	void test() {
		System.out.println("i am here");
	}
}
//honda is a concrete class because it has specific char
class Honda extends Bike //inheritance-- char of the parent class will be used by the child class
{
	void run() {
		System.out.println("running safely with Honda");
	}
	
	int mileage() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	int mileage(int test) {
		// TODO Auto-generated method stub
		return 10;
	}

	public static void main(String args[]) {
		Bike obj = new Honda();//parent can have certain chars which may 
		//or maynot be used by child class
		//Honda h= new Bike();//child class has limited or fractional features of the parent class
		//parent is a superset,child is a subset
		//obj.run();-- hiding the non req info
		obj.mileage();
		//obj.mileage(10);
	}


	
	
}


class Yamaha extends Bike //inheritance
{
	void run() {
		System.out.println("running safely with Honda");
	}
	
	int mileage() {
		// TODO Auto-generated method stub
		return 10;
	}

	public static void main(String args[]) {
		Bike obj = new Yamaha();
		obj.run();
		obj.mileage();
	}


	
	
}

class RE extends Bike //inheritance
{
	void run() {
		System.out.println("running safely with Honda");
	}
	
	int mileage() {
		// TODO Auto-generated method stub
		return 10;
	}

	public static void main(String args[]) {
		Bike obj = new RE();
		obj.run();
		obj.mileage();
	}


	
	
}