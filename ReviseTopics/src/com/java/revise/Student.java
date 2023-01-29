package com.java.revise;

import java.util.HashMap;
import java.util.Map;

//immutable class:
//1.final class, 2.private variables, 3. no setters
//no setters: so that value of the variable cannot be chnaged from outside
final class Student {

	public Student(String name, Map<String, String> metadata) {
		super();
		this.name = name;
		//this.metadata = metadata;
		Map<String,String> tMap= new HashMap<>();
		
		for(Map.Entry<String, String> entry:metadata.entrySet()) {
			tMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata=tMap;
	}
	private final String name;
	
	private final Map<String,String> metadata;
	
	public String getName() {
		return name;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
}
