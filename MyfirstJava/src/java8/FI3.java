package java8;
import java.util.function.Predicate;

public class FI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> lesserthan = i -> (i < 18); 
		  
        // Calling Predicate method
        System.out.println(lesserthan.test(10)); 
	}

}
