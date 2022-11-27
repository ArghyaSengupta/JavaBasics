package com.string.understanding;

public class CountCharacter {

	public static void main(String[] args) {

		//a is repeating
		String input="abcda";
		String str="1234";
		//Integer parses the value from string
		int result=Integer.parseInt(str);
		System.out.println(result);
		int c=0;
		char ch='a';//checking character
		for(int i=0;i<input.length();i++) 
		{
		//if the present character is equal to a
			if(input.charAt(i)==ch) {
				c++;
				}
		}
		System.out.println("a is repeated"+c+"number of times");
	}

}
