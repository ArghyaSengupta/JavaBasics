package test;

import static org.junit.Assert.assertEquals;

//import org.junit.jupiter.api.Test;//a specific api which is jupiter  
import org.junit.Test; //import is from junit5 for writing the test cases : general applicable for any api
public class TestSubject {  
    
	
	//Subject:parent class for which we are writing the test cases
    Subject obj = new Subject(); //creating an object of the parent class/subject 
     
    //============================//
    @Test  //annotation coming from junit5 /4.. : org.junit.api:/org.junit.jupiter
    public void testAdd() //test suites: don't return anything but process the operations same as the main class/subject
    {  
        obj.add("Emma");  //member values
        obj.add("Ronan");  
        obj.add("Antonio");  
       // obj.add("Paul");  
        //verifies a comparison
        //value to value
        //apple to apple
        assertEquals("Adding 4 student to list", "", obj.sizeOfStudent());  //size of the list is eq to 4?true:false;
    }  
    
    //into the assertEquals validation
    @Test  
    public void testSize() {  
        obj.add("Emma");  
        obj.add("Ronan");  
        obj.add("Antonio");  
        assertEquals("Checking size of List", 3, obj.sizeOfStudent());  
    }  
      
    @Test  
    public void testRemove() {  
        obj.add("Antonio");  
        obj.add("Paul");  
        obj.remove("Paul");  
        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());  
    }  
      
    @Test  
    public void removeAll() {  
        obj.removeAll();  
    }  
    
    @Test
    public void testAdd1() {
    	obj.addSet(5);
    }
}  
