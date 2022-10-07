package java8;
import java.util.function.Function;

public class FI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Double> half = a -> a / 2.0;
		//FI2 fi2=new FI2();
		
		//fi2.divide(5);
		 
        // Applying the function to get the result
        System.out.println(half.apply(10));
	}
	

}
