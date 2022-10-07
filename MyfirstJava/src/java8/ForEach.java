package java8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


@FunctionalInterface
interface TestForEach{
	void print(Set test);
	
	//void test(List list);
	//non abstract method
	default void test() {
		System.out.println("i am here");
	}
}
public class ForEach implements TestForEach{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  //1
        gamesList.add("Cricket");  //2
        gamesList.add("Chess");  //3
        gamesList.add("Hocky"); //4 
        
        
        //value through for loop : long code: this should not be used going further
		
		 for(int i=0;i<gamesList.size();i++) { System.out.println(gamesList.get(i)); }
		
        
        //value through foreach iterator : easy and efficient
        System.out.println("------------Iterating by passing lambda expression--------------");  
        //for each works on collection of items or elements
        //????games: temporary variable
        //gameslist : list of ietms
        //1 item : games
        //games-->System.out.println(games);//local variable: temporary storage: alive only till the expression: lambda expression is alive
        gamesList.forEach(games -> System.out.println(games)); //lambda used here : Parent class of List.Set.Queue :Collection interface
        //TestForEach tfe=games -> System.out.println(games);//correct this statement 
        //iterable
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        List<String> gamesList1 = new ArrayList<String>();  
        gamesList1.add("Football");  
        gamesList1.add("Cricket");  
        gamesList1.add("Chess");  
        gamesList1.add("Hocky");  
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList1.forEach(System.out::println);  
        
        //List<String> gamesList2 = new ArrayList<String>();
        List<String> gamesList2 = new LinkedList<String>();
        gamesList2.add("Cricket");  
        gamesList2.add("Volleyball");  
        gamesList2.add("Chess");  
        gamesList2.add("Hocky");  
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList2.stream().forEachOrdered(games -> System.out.println(games)); 
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList2.stream().forEachOrdered(System.out::println);  
	}

	@Override
	public void print(Set test) {
		// TODO Auto-generated method stub
		
	}

}
