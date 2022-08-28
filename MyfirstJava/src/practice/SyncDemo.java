package practice;

// A Class used to send a message
class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg );
		try
		{
			//sleep value is changeable as per the need
			//halts the process- in ms: there is no exception here
			Thread.sleep(1000);//waiting stage-1)time to wait,2)wait
		}
		catch (Exception e)
		{
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

// Class for send a message using Threads
class ThreadedSend extends Thread
{
	private String msg;//access specifiers:encapsulation,abstraction,inheritence
	Sender sender;

	// Receives a message object and a string
	// message to be sent: initialize values/states
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()//executes thread/s
	//t1,t2,t3....
	//t1: m1,m2,m3....:1 msg will be executed
	//t2:...
	//t3......
	{
		// Only one thread can send a message
		// at a time.
		synchronized(sender) //block
		{
			// synchronizing the send object
			sender.send(msg);
		}
	}
}

// Driver class: main()
class SyncDemo
{
	public static void main(String args[])
	{
		
		//job1: waiting the thread for 1000ms
		//job2: exeuting one thread work at a time
		Sender send = new Sender();
		ThreadedSend S1 =
			new ThreadedSend( " Hi " , send );
		ThreadedSend S2 =
			new ThreadedSend( " Bye " , send );

		// Start two threads of ThreadedSend type
		S1.start();
		S2.start();

		// wait for threads to end
		try
		{
			//this block ensures one thread is complted then only
			//other thread executes
			//no locking
			//no dependency
			//s1 not dependent on s2
			//s1 not able to complete without s2:lock
			//no lock here
			//invocation: calling,executing
			S1.join();//ensures that s1 is completed: start-->run-->terminated
			S2.join();//ditto for s2
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
		
		finally {
			System.out.println("i am here");
		}
	}
}
