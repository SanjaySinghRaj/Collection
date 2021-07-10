package queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue obj1=new PriorityQueue(Collections.reverseOrder());
		obj1.offer(10);
		obj1.offer(-10);
		obj1.offer(0);
		obj1.offer(2);
		obj1.offer(20);
		System.out.println(obj1);
		System.out.println(obj1.peek());
		System.out.println(obj1.poll());
		System.out.println(obj1.poll());
		System.out.println(obj1.poll());
		System.out.println(obj1.peek());
	}

}
