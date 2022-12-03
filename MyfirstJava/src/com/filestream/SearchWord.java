package com.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchWord {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
	      System.out.println("Enter the word to be found");
	      String word = sc1.next();
	      boolean flag = false;//this is a checker for word that user is searching
	      int count = 0;
	      System.out.println("Contents of the line");
	      //Reading the contents of the file
	      Scanner sc2 = 
	     new Scanner(new FileInputStream("/Users/argsengu/eclipse-workspace/MyfirstJava/FileSystem/src/a.txt"));
	      while(sc2.hasNextLine()) {
	         String line = sc2.nextLine();
	         System.out.println(line);
	         if(line.indexOf(word)!=-1) //checks if the line has ended
	         {
	            flag = true;
	            count = count+1;
	         }
	      }
	      if(flag)//if the word is found
	      {
	         System.out.println("File contains the specified word");
	         System.out.println("Number of occurrences is: "+count);
	      } else {
	         System.out.println("File does not contain the specified word");
	      }
	   }
	}
