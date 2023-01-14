package java8;
/**
 * 
 */

/**
 * @author Java8
 *
 */

@FunctionalInterface
interface MathOperation {
	      int operation(int a, int b);//one abstract ()
	   }


public class LambdaPractice {

	
	//property
	//behaviour
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaPractice tester = new LambdaPractice();
		
		//Classname objname= new Classname()
		// TODO Auto-generated method stub
		
		   //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;//anonymous function, no storage needed
	      
			
	      //with out type declaration
	      //param1:a, param2:b
	      MathOperation subtraction = (a, b) -> a - b;
	      //no data type needed for same
	      //type of expression
			
	      //with return statement along with curly braces (optional not mandatory)
	      MathOperation multiplication = (a,b) -> { return a * b; };
			
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
	      
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      //addition: (a+b) using lambda expression
	      //arg1=10,arg2=5,arg3:functional interface type:additoon: arg3
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
			
	      //without parenthesis
	      GreetingService greetService1 = message ->
	      System.out.println("Hello " + message);//first object of the functional interface
			
	      //with parenthesis
	      GreetingService greetService2 = (message) ->
	      System.out.println("Hello " + message);//second function of the fi
			
	      greetService1.sayMessage("Mahesh");
	      greetService2.sayMessage("Suresh");
	   }
		
	
	   
	@FunctionalInterface
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   //method:3 param : 1. arg1, 2.arg2, 3:obj of functional interface
	   //returns method from the functional interface
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	   

}
