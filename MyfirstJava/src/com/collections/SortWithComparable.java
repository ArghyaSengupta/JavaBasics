package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortWithComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(101,"V",23));
		al.add(new Student(106,"V1",27));
		al.add(new Student(105,"V2",21));
		Collections.sort(al);
		
		for(Student s:al) {
			System.out.println(s.roll+" "+s.name+" "+s.age);
		}
	}

}
