package com.string.understanding;

public class ReverseString {

	public static void main(String[] args) {

		String name="Gaurav";
		String reverseString="";
		//decremental loop
		for(int i=name.length()-1;i>=0;i--) {
			//add the strings from last
			//concatenating
			reverseString=reverseString+name.charAt(i);
		}
		System.out.println(reverseString);
	}

}
