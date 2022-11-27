package com.thread.understanding;

//Way 2
//Using runnable interface
public class ThreadUsingRunnable  implements Runnable{

	
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " "+
				"executing run() method");
		
	}

}
