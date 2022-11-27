package com.more.examples;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Vehicle{

public static void main (String[] args) {

String str= "Geeks", nstr="";
char ch;

System.out.print("Original word: ");
System.out.println("Geeks"); //Example word

for (int i=0; i<str.length(); i++)
{
ch= str.charAt(i); //extracts each character
nstr= ch+nstr; //adds each character in front of the existing string

System.out.println(nstr);
}
System.out.println("Reversed word: "+ nstr);
}

}