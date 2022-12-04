package com.map;

import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Linked Hashmap doesn't allow duplicates
		java.util.LinkedHashMap<Integer, String> hm= new java.util.LinkedHashMap<>();
		hm.put(100, "a");
		hm.put(100, "a");
		hm.put(211, "b");
		
		for(Map.Entry<Integer,String> m:hm.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
	}

}
}
