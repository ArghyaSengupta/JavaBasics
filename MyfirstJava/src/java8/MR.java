package java8;
@FunctionalInterface
interface Sayable{  
    void say(); 
}  

@FunctionalInterface
interface Sayable2{  
    void say();  
}  
public class MR { 
	
    public static void saySomething(){  
        System.out.println("Hello, this is static method."); 
        //return 1;
    }  
    
    //MR mr=new MR();
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MR::saySomething;  
        //MR mr= new MR();
        //mr.saySomething();
        // Calling interface method  
        sayable.say();//FI when we have 1 abstract method:
        //to refer to that common behaviour
        //calling that behaviour
        
        Sayable2 sayable2 = MR::saySomething;  
        // Calling interface method  
        sayable2.say();
    }  
    
}