package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map has 2 things
		//1: key
		//2: value in that key
		//1-->amit,2-->Rahul
		Map<Integer,String> map= new HashMap();//this way we create a simple map
		//insertion
		//1:key , amit:value
		map.put(1, "Amit");
		map.put(2, "Rahul");
		
		//Traverse or iterate or loop over a Map
		Set set=map.entrySet();//convert the map to a set: entrySet
		Iterator it=set.iterator();
		while(it.hasNext()) {
			//actual traversal or iteration or touch every element
			//entry object is the main source of data for a Map
			Map.Entry entry=(Map.Entry)it.next();//type casting: set iteration to a map iteration
			entry.getKey();//1,2: the keys from entry object
			entry.getValue();//Amit,Rahul: values from entry object
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//all the keys separately: for each
		for(int id:map.keySet()) {
			System.out.println(id);//all the keys one by one
		}
		
		//all the values separately: for each
		for(String v:map.values()) {
			System.out.println(v);//all the values one by one
		}
		
	}

}
