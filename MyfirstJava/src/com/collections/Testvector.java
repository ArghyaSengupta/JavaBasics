package com.collections;

import java.util.Iterator;
import java.util.Vector;

public class Testvector {

	public static void main(String[] args) {

		//Syncronized
		//If you create multiple vectors
		//unless one vector finishes the job
		//other vector will wait
		//slow: arrangement or manipulation
		Vector<String> v= new Vector<String>();
		v.add("Ravi");
		v.add("Ram");
		
		Iterator<String> it= v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
