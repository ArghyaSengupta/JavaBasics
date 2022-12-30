package java8;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class FI4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
  
        Supplier<LocalDateTime> t=()->LocalDateTime.now();
        LocalDateTime presentTime=t.get();
        System.out.println(presentTime);
        
        
  // Print the random value using get()
        System.out.println(randomValue.get());
	}

}
