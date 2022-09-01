package collectionspackage;

//Java program to Iterate the Elements
//in an ArrayList

//Importing java utility classes
import java.util.*;

//Main class
public class ListIteratiion {

	// main driver method
	public static void main(String args[])
	{
		// Creating an empty Arraylist of string type
		List<String> al = new ArrayList<>();
        
		List list=new ArrayList<>();
        list.add(1);
        list.add("3");
         list.add(3.00);
         
		// Adding elements to above object of ArrayList
		al.add("Geeks");//adding element 1
		al.add("Geeks");//adding duplicate element
		//duplicates are allowed in list

		// Adding element at specified position
		// inside list object
		al.add(1, "For");

		// Using for loop for iteration: index based
	for (int i = 0; i < al.size(); i++) {
//1,2,3,4,5,6:0
			// Using get() method to
			// access particular element:value
			System.out.print(al.get(i) + " ");
			al.get(5);//6
		}

		// New line for better readability
		System.out.println();

		// Using for-each loop for iteration:value based
	for (String str : al)

			// Printing all the elements
			// which was inside object
			System.out.print(str + " ");
	}
}

