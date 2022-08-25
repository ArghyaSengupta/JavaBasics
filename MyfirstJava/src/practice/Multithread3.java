package practice;

//abstraction
class MultithreadingDemo implements Runnable {
    public void run()
    {
        //some code here
    }
}
 
// Main Class
class Multithread3 {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
        	//Thread is the parent class=new instance of type thread
            //typecasting:interface type to a class type
        	//unboxing
        	Thread object
                = new Thread(new MultithreadingDemo());
            //MultithreadingDemo obj=new MultithreadingDemo();
            //obj.
            object.start();//start is only present inside thread class
        }
    }
}
