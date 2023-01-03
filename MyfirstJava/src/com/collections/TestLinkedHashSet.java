package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		//always maintains insertion order
		//duplicates not available
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		set.add("Ravi");//1
		set.add("Ram");//2
		set.add(null);//3
		set.add("Ravi");//4
		Iterator<String> it= set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
