package com.filestream;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir=new File("path");//replace it with your path
		if(dir.isDirectory()) {
			
			List<String> list=Arrays.asList(dir.list());
			System.out.println("Files are now still unsorted");
			
			for(String s:list) {
				System.out.println(s);
			}
			
			
			System.out.println("Sorted");
			Collections.sort(list);
			Collections.sort(list,Collections.reverseOrder());
			for(String s1:list) {
				System.out.println(s1);
			}
		}
	}

}
