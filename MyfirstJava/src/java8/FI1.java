package java8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FI1 {

	public static void main(String[] args) {
		
		FI1 a1= new FI1();
		// TODO Auto-generated method stub
		//b:place holder/data holder/object
		//b=1 : accept () sends the value to the consumer
		//consumer applies that value for b
		Consumer<Integer> display = b -> System.out.println(b);

		
		// Implement display using accept()
        display.accept(1);
 
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
 
        // Consumer to display a list of numbers
        Consumer<List<Integer> >
            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));//iteration
            dispList = list -> list.stream().forEachOrdered(a -> System.out.print(a + " "));//iteration with ordering
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
 
        // Implement modify using accept()
        modify.accept(list);
 
        // Implement dispList using accept()
        dispList.accept(list);
    }
	

	}


