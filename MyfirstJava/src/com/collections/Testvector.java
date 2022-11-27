package com.collections;

import java.util.Iterator;
import java.util.Vector;

public class Testvector {

	public static void main(String[] args) {

		//Syncronized:complete one job
		//it will not go ot the other job
		//task:adding
		//removing
		//editing
		//program
		//code
		//java
		//oops
		//If you create multiple vectors
		//unless one vector finishes the job
		//other vector will wait
		//slow: arrangement or manipulation
		Vector<String> v= new Vector<String>();
		v.add("Ravi");
		v.add("Ram");
		v.remove(0);
		v.add("tiger");
		//list follows insertion order
		Iterator<String> it= v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
