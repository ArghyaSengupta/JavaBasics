package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {

		//int a[5]= {1,2,3,4,"a"};//no scope of diff type
		ArrayList al= new ArrayList();//scope of diff type
		al.add(1);
		al.add("r");
		//created collection List
		//any kind of manipulation in AL is slow
		//internally it uses Array
		//search any element
		//sort any element
		ArrayList<String> list =
				new ArrayList<String>();
		list.add("Ravi");
		list.add("Ra");
		list.add("Ram");
		list.add("Ram");
		list.add("Ravi");
		
		Iterator itr= list.iterator();
		//hasNext checks if there is any further value
		//available
		//inbuilt incremental
		while(itr.hasNext()) {
			//fetches the next value
			System.out.println(itr.next());
		}
	}

}
