package com.filestream;

import java.io.FileInputStream;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		FileInputStream fin= 
		new FileInputStream("/Users/argsengu/eclipse-workspace/MyfirstJava/FileSystem/src/a.txt");
			//int i=fin.read();
			int j=0;
			//System.out.println((char)i);
			while((j=fin.read())!=-1){
				System.out.println((char)j);
			}
			fin.close();//when you open a file
			//we need to close it
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
