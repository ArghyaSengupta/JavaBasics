package com.collections;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		//LIFO:
		//Last
		//in
		//first
		//out
		Stack<String> stack= new Stack<String>();
		stack.push("Ravi");//
		stack.push("Ram");//
		//stack.pop();
		stack.push("pk");
		stack.pop();//indicate addition of elements is done and element
		//is removed
		//stack.iterator will allow you to iterate over the existing data
		Iterator<String> it= stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
