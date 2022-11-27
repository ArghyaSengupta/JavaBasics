package com.control.loops;

public class PyramidExample {

	public static void main(String args[]) {
		
		//i=row
		for(int i=1;i<=5;i++) {
			//j=column
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();//new line
		}
	}
}
