package practice;

import java.util.ArrayList;

//Java program to convert ArrayList
//to HashSet using constructor

import java.util.HashSet;

class ListToSet {
	public static void main(String[] args)
	{
	
		// adding elements to ArrayList object
		ArrayList<String> ListToSet = new ArrayList<>();
		

		ListToSet.add("data structure");
		ListToSet.add("competitive programming");
		ListToSet.add("Interviews");
		ListToSet.add("FANG");
		ListToSet.add("FANG");

		// pass ArrayList object into the HashSet object
		// constructor
		HashSet<String> hashSet = new HashSet<>(ListToSet);

		// printing every element in Set

		for (String value : hashSet) {
			System.out.println(value);
		}
	}
}

