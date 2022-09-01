package collectionspackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//list is of type arraylist
		//arraylist is belonging to java.util package
		//initialization
		//only string allowed
		ArrayList<String> list=new ArrayList<String>();//similar to an array
		//size is not pre determined
		ArrayList list2=new ArrayList();//any type of data can be added
		
		list.add("a");//only allows string
		list.add("a");
		list2.add(1);//any value
		
		//hashing: set uses hashtable for internal implementation
		Set<String> set=new HashSet<String>();
		Set set2=new HashSet();
		set.add("a");
		set.add("a");
		//so that duplicates are not allowed
		set2.add(1);
		System.out.println(set);
		System.out.println(list);
		
		//Map<key,Value>
		//student s1:r1, s2:r2,.....s10000=r10000(unique)
		//customer1:orderid1,....
		Map<String, Integer> hm
        = new HashMap<String, Integer>();
//asumption:name cannot be duplicate
    // Inserting pairs in above Map
    // using put() method
    hm.put("a", new Integer(100));//put a value with respect to a key
    hm.put("b", new Integer(200));//if keys are null(missing) or duplicate: values will be orphan
    hm.put("c", new Integer(300));
    hm.put("d", new Integer(400));
    hm.get("a");
	}
 
}
