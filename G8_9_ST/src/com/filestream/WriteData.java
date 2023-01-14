package com.filestream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {
//throws keyword lets the compiler know that exception may happedn
	//if file is not at the mentioned location
	//because we are using input to write a file
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        Scanner sc= new Scanner(System.in);//this will ask user to give the input
        System.out.println("Enter the number of files you have");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        System.out.println("Enter the location of your file");
        String a=sc.next();//String value read from console
		//FileOutputStream fs= new FileOutputStream("/Users/argsengu/eclipse-workspace/MyfirstJava/FileSystem/src/a.txt");
        FileOutputStream fs= new FileOutputStream(a);
		//allows users to write in the file
		//updating a file
		BufferedOutputStream bfs=new BufferedOutputStream(fs);//Library class
		//To allow us to write in a file
		//This is the new content that will update in the file
		String s="We";//content

		//reading the data line by line from the String
		byte b[]=s.getBytes();//each word in the sentence is tored in a byte
		//letter 1:w
		//word1:We
		//this updates each value in the file
		bfs.write(b);//updates the file
		bfs.flush();//it clears the data for the next entry
		fs.close();//closes the file
		System.out.println("success");//given to check if the program runs at all
		
	}
	}

}
