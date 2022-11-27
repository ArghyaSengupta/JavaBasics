package com.control.loops;

public class NestedForExample {

	public static void main(String args[]) {
		
		//if():condition: one time only
		//for :loop : same activity multiple times
	//loop1
	for(int i=1;i<=3;i++) 
	//i=1,2,3
	{
		//loop2 inside loop1 : nesting
		//i=1,j=1,2,3:11,12,12
		//i=2,j=1,2,3:21,22,23
		//i=3,j=1,2,3:31,32,33
		for(int j=1;j<=3;j++) {
			
			System.out.println(i+""+j);
		}//end of loop2
	}//end of loop1
}
}
