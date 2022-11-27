package com.thread.understanding;

//thread is an internal class
//threaddemo is a child class
//thread is parent class
public class ThreadDemo extends Thread{
	
	private Thread t;
	private String threadName;
	
	//T1=name
	//T2=name
	ThreadDemo(String name){
		threadName=name;//thread name will get the value from
		//the place where it will be called
		System.out.println("Creating "+threadName);
	}//

	//method 2 : run: it initiates the thread
	//runs the thread when it is available
	public void run() {
		System.out.println("Running"+ threadName);
		
		try {
			for(int i=4;i>0;i--) {
				System.out.println("thread:"+threadName+""+i);
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Thread finished"+threadName);
	}
	
	//method1: start the thread from beginning
	//thread is available
	public void start() {
		System.out.println(threadName);
		if(t==null) {
			t=new Thread(this.threadName);
		
		t.start();
		}
	}
}
