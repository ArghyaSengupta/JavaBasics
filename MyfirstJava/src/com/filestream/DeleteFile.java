package com.filestream;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File file= 
	    new File("/Users/argsengu/eclipse-workspace/MyfirstJava/FileSystem/src/c.txt");
		
		if(file.delete()) {
			
			System.out.println("deleted");
		}
		
		else {
			System.out.println("not deleted");
		}
	}

}
