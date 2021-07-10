package queue;

import java.util.LinkedList;

public class LinkedlistQ {

	public static void main(String[] args) {
		LinkedList obj1=new LinkedList();
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
		System.out.println(obj1.poll());
		System.out.println(obj1.peek());
		System.out.println(obj1.poll());
		System.out.println(obj1.peek());
		System.out.println(obj1.poll());

	}

}
