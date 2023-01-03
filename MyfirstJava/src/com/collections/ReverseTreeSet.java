package com.collections;

import java.util.Collections;
import java.util.TreeSet;

public class ReverseTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<String>(Collections.reverseOrder());

		treeSet.add("four");
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("one");
		
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>(Collections.reverseOrder());

		treeSet1.add(1);
		treeSet1.add(2);
		treeSet1.add(3);
		treeSet1.add(3);
		treeSet1.add(4);

		treeSet1.forEach(System.out::println);
		treeSet.forEach(System.out::println);
	}

}
