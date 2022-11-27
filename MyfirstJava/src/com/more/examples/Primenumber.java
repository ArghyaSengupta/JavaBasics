package com.more.examples;

public class Primenumber {
	
	 boolean checkPrime(int n) {
		
		if(n<=1)
			
			return false;
		else
			if(n==2)
				
		return true;
		
		for(int i=3;i<=Math.sqrt(n);i=i+2) {
			if(n%i==0)
				
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		
		//final int y = 10;
		
	
		

	}

}
