package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;  
public class Subject {  
    private List<String> students = new ArrayList<String>();  
    HashSet<Integer> set=new HashSet<Integer>();
  
    public void remove(String name) {  
        students.remove(name);  
    }  
      
    public void add(String name) {  
        students.add(name);  
    }  
      
    public void removeAll(){  
        students.clear();  
    }  
      
    public int sizeOfStudent() {  
        return students.size();  
    } 
    public void addSet(int num) {
    	set.add(num);
    }
      
}  
