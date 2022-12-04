package com.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Stream : more than single type and can be distributed across multiple users
		Map<Integer,String> map= new HashMap<Integer,String>();
	map.put(200, "a");
	map.put(100, "i");
	map.put(300, "b");
	//returns a set of the contents of the map
	//:: method reference : java 8 onwards
	//sorted is easilt dine using stream API in java 1.8: asc order : default order
	map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);// converts into stream
	//Returns a stream in sequence of data
	System.out.println(" Sorting in reverse order for keys  ");
	//descending order : Comparator.reverseOrder()
	map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	//sort on values
	System.out.println("Sorting on values");
	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	System.out.println("Sorting on values in reverse order");
	map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	//1,2,3,4... : low to high is asc
	//high to low is descending order:4,3.,2.,1
	
	}

}
