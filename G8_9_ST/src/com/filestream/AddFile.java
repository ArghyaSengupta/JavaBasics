package com.filestream;

import java.io.IOException;//Input Output
import java.nio.file.Files;//Files
import java.nio.file.Path;//Files
import java.nio.file.Paths;//Files
import java.util.Scanner;//util: for taking user input

public class AddFile {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the file to be added with the path...");
		String name=scanner.next();//reads the files one by one
		
		Path path=Paths.get(name);//gets the input value from console
		Files.createDirectories(path.getParent());//passing the input value to the file creation
		
		try {
			Files.createFile(path);//file created inside the location
		}
		catch(Exception e) {
			System.out.println(e.toString());//this will pri
		}
		
	}

}
