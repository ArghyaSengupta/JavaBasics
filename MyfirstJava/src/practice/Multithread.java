package practice;

//inheritence: run and start
class Multithread2 extends Thread {
    public void run()//executes the thread or runs the thread
    {
        //some code
    }
}
 
// Main Class
public class Multithread {
	//driver method
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) //i-0,i-1....7
        {
            Multithread2 object
                = new Multithread2();//t1,t2,...t8(independent)-- multiple threads by referring to one thread class
            object.start();///t1-start,t2-start,...t8-start
            //t1---t8: run()--start will caal run after the start stage is done
        }
    }
}
