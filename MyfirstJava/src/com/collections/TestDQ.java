package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDQ {

	public static void main(String[] args) {

		//add elements from both ends
		//queue has only fifo
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("a");//String
		dq.add("b");//String
		
		Deque<Integer> dq1=new ArrayDeque<Integer>();
		dq1.add(1);
		dq1.add(2);
		
		//for-each
		for(String str:dq) {
			System.out.println(str);
		}
	}

}
