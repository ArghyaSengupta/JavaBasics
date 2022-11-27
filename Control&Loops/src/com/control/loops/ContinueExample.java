package com.control.loops;

public class ContinueExample {

	public static void main(String[] args) {

		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				//skip
				continue;//only one statement
			}
			//else
			System.out.println(i);
		}
	}

}
