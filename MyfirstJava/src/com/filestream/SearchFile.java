package com.filestream;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Location: directory
		//many files
		//one file
		
		SearchFile sf= new SearchFile();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the file to be searched...");
		String name=scanner.next();//reads the files one by one
		System.out.println("Enter the directory to search..");
		String dir=scanner.next();//reads the files one by one
		//directory or the location is a part of the File library
		sf.findFile(name, new File(dir));
	}
	
	//is to find a file in a directory
	void findFile(String name,File file) {
		
		File[] list=file.listFiles();
		if(list!=null) {
			//for each loop
			//left of : should be having the same data type of the right of colon
			for(File f1:list) {
				//check if the file is not a directory
				if((f1.isDirectory())) {
					findFile(name, f1);}
				else if(name.equalsIgnoreCase(f1.getName())) {
					System.out.println("I am here:"+f1.getParentFile());
				}
				else {
					System.out.println("File unavailable");//executed for  the number of times file unavailable
					//or available
				}
			}
		}
	}

}
