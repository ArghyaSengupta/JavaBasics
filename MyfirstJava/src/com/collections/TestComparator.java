package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {

	
	public static void main(String args[]) {
		//LinkedList?
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(101,"v",23));
		al.add(new Student(102,"v",2));
		al.add(new Student(111,"v",3));
		
		//sorting by name
		Collections.sort(al,new NameComparator() );
		
		for(Student s:al) {
			System.out.println(s.roll);
			System.out.println(s.name);
			System.out.println(s.age);
		}
		
		//sort by age
		Collections.sort(al,new AgeComparator());
		
		for(Student s:al) {
			
			System.out.println(s.age);
			System.out.println(s.roll);
			System.out.println(s.name);
			
		}
		
	}
}
