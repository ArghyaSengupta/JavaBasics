package collectionspackage;

import java.util.LinkedList;
import java.util.List;

class LinkedListTest {
	public static void main(String[] args)
	{
		// Size of the LinkedList
		int n = 5;

		// Declaring the List with initial size n
		List<Integer> ll = new LinkedList<Integer>();

		// Appending the new elements
		// at the end of the list
		//1,2,3,4:1
		for (int i = 1; i <= n; i++)
			ll.add(i);
		   

		// Printing elements
		System.out.println(ll);

		// Remove element at index 3
		ll.remove(3);//index

		// Displaying the list after deletion
		System.out.println(ll);

		// Printing elements one by one
		for (int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
	}
}

