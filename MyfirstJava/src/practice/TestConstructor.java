package practice;

public class TestConstructor {

	//boolean : flag : 0/1 or false and true
	public TestConstructor() {
		int noOfLegs=2;//initialization-generalization-minimum value
		// TODO Auto-generated constructor stub
	}
	
	//constructor: no return type
	public TestConstructor(int wings,boolean fly) {
		if(wings==2)
			fly=true;
	}

	//method:has return type
	public static String TestConstructor() {
		// TODO Auto-generated constructor stub
		return "";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
