package com.wrapperclass;

public class WrapperExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;//integer
		Integer i=Integer.valueOf(a);//converting int a into Integer explcitly
		Integer j=a;//implicit or automatic conversion
		
		System.out.println(a+""+i+""+j);
		
		//proves that Integer is a class and moreover it is a wrapper class
		//it wras the int value inside it
		Integer a1 = new Integer(20);//Integer is a wrapper class
		int i1=a1.intValue();
		
		String str="34";//string variable
		
		//try {
			//here Integer is the wrapper class that 
			//provides with parseInt()
			int number= Integer.parseInt(str);
			System.out.println(number);
		//}
		//catch(Exception e) {
		//	e.printStackTrace();
		//}
	}

}
