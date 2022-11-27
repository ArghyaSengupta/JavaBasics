
//class M is a child class of B1 parent class
//B1:abstract class which implements A1 interface
//a() is available inside the abstract class
//remaining all abstract methods must be used by M class
public class M extends B1{

	@Override
	public void b() {
		System.out.println("i am b");
		
	}

	@Override
	public void c() {
		System.out.println("i am c");
		
	}

	@Override
	public void d() {
		System.out.println("i am d");
		
	}

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 40;
	}


	

}
