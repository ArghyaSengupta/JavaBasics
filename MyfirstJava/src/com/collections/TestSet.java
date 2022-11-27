package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {

		//set doesn't allow duplicates
		HashSet<String> set= new HashSet<String>();
		set.add("a");//1
		set.add("a");//?
		set.add("b");//2
		set.add(null);//3--preferred to top
		set.isEmpty();//it checks if the collection is empty
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
