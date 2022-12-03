package com.filestream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the file to be added with the path...");
		String name=scanner.next();//reads the files one by one
		
		Path path=Paths.get(name);
		Files.createDirectories(path.getParent());
		
		try {
			Files.createFile(path);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
