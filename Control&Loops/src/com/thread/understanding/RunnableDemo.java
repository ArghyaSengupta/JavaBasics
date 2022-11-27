package com.thread.understanding;

public class RunnableDemo {
public static void main(String args[]) {

	//thread class should have the thread passed 
	//to the constructor
	//Runnable is a functional interface
	//it has only 1 abstract method
	Thread T1= new Thread(new ThreadUsingRunnable());
	T1.start();
}
}
