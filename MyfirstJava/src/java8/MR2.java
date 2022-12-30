package java8;
public class MR2 { 

	
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
        
    }  
    
    
    public static void main(String[] args) {  
    	//MR2:CLASS
    	//REFERRING TO A 
    	//METHOD DIRECTLY FROM A CLASS WITHOUT CREATING 
    	//THE OBJECT IS ACHIOEVED WITH
    	//METHOD REFERENCE SYNTAX ( :: )
        Thread t2=new Thread(MR2::ThreadStatus);
        //gives knowledge about thread 
        //as well as functional interface along with method references
        t2.start();  
    }  
}  