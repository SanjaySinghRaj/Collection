package arraylist;

import java.util.ArrayList;

public class Al3 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		obj1.add(1);
		obj1.add('a');
		obj1.add(29.3f);
		obj1.add("hello");
		obj1.add(2);
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		ArrayList obj2=new ArrayList();
		obj2.add(1);
		obj2.add('b');
		obj2.add(29.4f);
		obj2.add("hllo");
		obj2.add(2);
		System.out.println(obj1);
		System.out.println(obj2);
		//obj2.removeAll(obj1);
		obj2.retainAll(obj1);
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
