package MyFirstJavaPackage;

public class Arithmatic implements IShape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int areaOfTrapezium=1/2*24*0;
			int value=areaOfTrapezium/0;//exception: runtime
		}
		
		catch(ArithmeticException e){
			System.out.println("i am in exception");
			System.out.println(e.toString());
		}
	}
//prioritize this block over the one inside the interface
	@Override
	public int numberOfSides() {
		// TODO Auto-generated method stub
		return 10;
	}

}
