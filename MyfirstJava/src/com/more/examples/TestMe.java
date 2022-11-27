package com.more.examples;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Set a1 = new HashSet();
		 * 
		 * a1.add("test"); a1.add("test1"); a1.add(9);
		 * 
		 * Iterator<String> i1 = a1.iterator();
		 * 
		 * while(i1.hasNext()) {
		 * 
		 * 
		 * String a2 = i1.next(); System.out.println(a2);
		 * 
		 * if(!a2.isEmpty())
		 * 
		 * System.out.println("I am here");
		 * 
		 * 
		 * }
		 */
		
		
		
		/*
		 * List l1 = new ArrayList();
		 * 
		 * l1.add("test"); l1.add("test1"); l1.add("9");
		 * 
		 * Iterator<String> i2 = l1.iterator();
		 * 
		 * while(i2.hasNext()) {
		 * 
		 * 
		 * String l2 = i2.next(); System.out.println(l2);
		 * 
		 * if(!l2.isEmpty())
		 * 
		 * System.out.println("I am here");
		 * 
		 * 
		 * }
		 */
		
		Map<String,Integer> m = new HashMap();
		m.put("A",3 );
		m.put("B",2 );
		
		
		
		/*
		 * Map.Entry<String,Integer> entry = m.entrySet().iterator().next();
		 * 
		 * 
		 * String key= entry.getKey(); int value=entry.getValue();
		 * System.out.println(key); System.out.println(value);
		 */
		
		
		//System.out.println(m);
		
		for (Map.Entry<String,Integer> entry : m.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());

}
}
