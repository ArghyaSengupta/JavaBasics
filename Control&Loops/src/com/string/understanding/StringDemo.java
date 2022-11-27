package com.string.understanding;

public class StringDemo {

	public static void main(String[] args) {

		char[] helloArray= {'h','e','l','o'};
		
	
		for(int i=0;i<helloArray.length;i++) {
			System.out.println(i);
		}
		//default constructor of String class
		//this line is converting a charter into string
		String result= new String(helloArray);
		System.out.println(result.length());
		System.out.println(result);
		String s1="I am";
		String s2="a boy";
		String s3="a Boy";
		System.out.println(s2.equals(s3));//false
		//boy and Boy are different
		System.out.println(s2.equalsIgnoreCase(s3));
		//ignores the upper and lower case differences
		System.out.println(s1+" "+s2);//concatenation
		
		
	}

}
