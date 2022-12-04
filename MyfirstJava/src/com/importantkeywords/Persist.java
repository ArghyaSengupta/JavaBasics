package com.importantkeywords;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//it ignores the value of age
		//saves default value of that variable data type
		//int a=10 transient
		//ignore 10 and set the default value of int to a
		Student s1=new Student(211, "ravi", 22);
		FileOutputStream f= new FileOutputStream("/Users/argsengu/Documents/GitHub/JavaBasics/MyfirstJava/src/a.txt");
		ObjectOutputStream out= new ObjectOutputStream(f);
		out.writeObject(s1);
		out.flush();
		out.close();
		f.close();
		System.out.println("Success");

	}

}
