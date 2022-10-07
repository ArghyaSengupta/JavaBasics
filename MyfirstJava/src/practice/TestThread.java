package practice;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {

   public static void main(final String[] arguments) throws InterruptedException {
	   //concurrent: many things happening in parallel: T1, T2,...
      Executor executor = Executors.newCachedThreadPool();//when we want multiple things at one point
      executor.execute(new Task());//passing the constructor call for thread creations.threads with difference of duration= 5mins(assume)//
      //repeat same task ...: pool of tasks
      ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;//threadpool executor creates a pool of thread
      //pool of threads means many threads with difference = same=5 mins
      pool.shutdown();
   }
   
   
//class xyz implements Runnable--> xyz is eligible to become a thread-p1
   //class xyz extending Thread --> xyz is eligibble to become a thread -p2
   //nested class : static : to create threads with a difference of duration=5 mins
   static class Task implements Runnable //task =thread by p1
   {
      
      public void run() {
         
         try {
            Long duration = (long) (Math.random() * 5);//hard coding the time=5 mins
            System.out.println("Running Task!");
            TimeUnit.SECONDS.sleep(duration);//hakting the thread: every thread willexecute after an interval of 5 mins
            //t1... 5mins.... t2.....5 mins..... : sleep : takes one and onlye one argument : duration
            //t2-t1=t3-t2=t4-t3....= 5mins(assume)
            System.out.println("Task Completed");
         } catch (InterruptedException e) {
            //System.out.println(e.toString()); 
        	 e.printStackTrace();
           
         }
      }
   }
}
