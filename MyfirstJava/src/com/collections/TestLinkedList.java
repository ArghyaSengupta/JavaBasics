package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		//Manipulation is very fast
		//double ended changes
		//Manipulation
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Rav");
		ll.add("Ram");
		ll.add("Ram");
		ll.add("Ra");
		ll.add("Ravi");
		
		Iterator<String> it= ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
