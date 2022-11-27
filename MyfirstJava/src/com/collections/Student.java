package com.collections;

public class Student implements Comparable<Student>{

	int roll;
	String name;
	int age;
	
	Student(int roll,String name,int age){
		this.roll=roll;
		this.name=name;
		this.age=age;
	}
	//sorting through age
	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		//return 0;
		if(age==st.age)
			return 0;
		else if(age>st.age)
			 return 1;
		else 
			return -1;
	}
	
	

}
