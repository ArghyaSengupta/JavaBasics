package com.thread.understanding;

public class TestThread {
	public static void main(String args[]) {
		ThreadDemo T1= new ThreadDemo("Thread-1");
		T1.start();
		ThreadDemo T2= new ThreadDemo("Thread-2");
		T2.start();
		ThreadDemo T3= new ThreadDemo("Thread-3");
		T3.start();
	}

}
