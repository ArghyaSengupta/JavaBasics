package java8;
import java.util.function.Function;

public class FI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.0 is user defined
//a: is passed as a mandatory argument to the FI
		Function<Integer, Double> half = a -> a / 2.0;
		
		//FI2 fi2=new FI2();
		
		//fi2.divide(5);
		 
        // Applying the function to get the result
		//value passed to the apply () is the parent data type
		//2nd parameter in the Function FI is optional and should not
		//be passed
        System.out.println(half.apply(10));
	}
	

}
