package com.innerclass;

//outer class
public class OuterClass {

	//private: this variable cannot be used outside this class
	//OOP:encapsulates the properties inside the object
	private int data=30;
	void msg1() {
		System.out.println("data is:"+data);
	}
	 //inner class
	public class InnerClass{
		
		  void msg() { 
		try {
			System.out.println("data is:"+data);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} }
		 
		
	}
	
	//main : method : in java program runs in a stack
	//LIFO: Stack
	//any program in java needs only 1 main ()
	//void means that this method does not return any value
	//automatic called from JVM
	//JVM: Internal machine that controls a java program
	 public static void main(String args[]) { 
		 OuterClass obj1= new  OuterClass();
	     OuterClass.InnerClass in=obj1.new InnerClass();//object creation of the inner class 
	     in.msg(); 
	 }
	

}
