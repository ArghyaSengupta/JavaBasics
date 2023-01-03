package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestQueue {

	public static void main(String[] args) {

		//FIFO
		//which or what is the condition of fifo?:priority
		//cannot add null
		PriorityQueue<String> queue= new PriorityQueue<String>();
		//Queue<String> queue1= new Queue<String>();
		queue.add("Ravi");
		queue.add("Ram");
		queue.add("Ram1");
		queue.add("Ram2");
		queue.add(null);//cannot insert null
		//head:start
		//tail:end
		System.out.println("element:"+queue.element());//value fetch
		System.out.println("peek"+queue.peek());//value check
		
		Iterator it= queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//queue.remove();//remove tech1
		queue.poll();//remove tech 2 : head of the Queue
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
	}

}
