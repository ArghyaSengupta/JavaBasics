package com.control.loops;

//very frequently asked in interviews
public class PyramidExample2 {

	public static void main(String args[]) {
		//rows=6, incremental
		for(int i=1;i<=6;i++) {
			
			//columns=6 : decremental is reversing
			//the pyramid
			for(int j=6;j>=i;j--) {
				System.out.print("* ");
				
			}
			System.out.println();//new line
		}
	}
}
