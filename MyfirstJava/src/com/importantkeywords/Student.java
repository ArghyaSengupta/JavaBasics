package com.importantkeywords;

import java.io.Serializable;

//Serializable : for using transient
//it is an internal interface
public class Student implements Serializable{
	
	int id;
	String name;
	transient int age;//keyword under inspection
	
	//10,"a",20
	Student(int id, String name,int age){
		this.id=id;//current value
		this.name=name;
		this.age=age;
	}

}
