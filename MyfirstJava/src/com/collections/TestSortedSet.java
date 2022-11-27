package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

//SortedSet
public class TestSortedSet {
	
	public static void main (String args[]) {
		
		//Treeset -->Set:Sorting in Set
		//Tree structure to store data
		
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Ravi");
		ts.add("Ajay");
		ts.add("Shyam");
		
		TreeSet<Integer> ts1= new TreeSet<Integer>();
		ts1.add(121);
		ts1.add(1);
		ts1.add(23);
		Iterator<String> it= ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<Integer> it2= ts1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
