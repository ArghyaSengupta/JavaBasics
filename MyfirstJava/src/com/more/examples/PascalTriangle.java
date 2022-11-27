package com.more.examples;

public class PascalTriangle {
	
	public int factorial(int i) {
		
		if(i==0) {
			return 1;
		}
		else {
			return i*factorial(i-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =4,i,j;
		
		PascalTriangle pt = new PascalTriangle();
		
		for(i=0;i<=n;i++) {
			
			for(j=0;j<=n-1;j++) {
				
				System.out.print(" ");
			}
			
			for(j=0;j<=i;j++) {
				
				System.out.print( " "+ pt.factorial(i)/(pt.factorial(i-j)*pt.factorial(j)));
			
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
	}

}
