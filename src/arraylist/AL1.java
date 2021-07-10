package arraylist;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		obj1.add(1);
		obj1.add("Hello");
		obj1.add(2);
		obj1.add("Hello");
		obj1.add('a');
		obj1.add(2, 10);
		System.out.println(obj1);
		obj1.set(1, "hi");
		obj1.add(0, null);
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.get(0));
		for (int i = 0; i < obj1.size(); i++) {
			System.out.println(obj1.get(i));
			
		}
		obj1.remove(0);
		obj1.remove("Hello");
		System.out.println(obj1);
		obj1.clear();
		System.out.println(obj1);
		

	}

}
