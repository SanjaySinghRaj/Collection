package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class AL4 {

	public static void main(String[] args) {
		ArrayList<Integer> obj1=new ArrayList();
		System.out.println(obj1);
		System.out.println(obj1.size());
		System.out.println(obj1.isEmpty());
		obj1.add(1);
		obj1.add(0);
		obj1.add(4);
		obj1.add(2);
		obj1.add(3);
		//obj1.add("ab");
		System.out.println(obj1);
		Collections.sort(obj1);
		System.out.println(obj1);
		for (int i = 0; i < obj1.size(); i++) {
			System.out.println(obj1.get(i));
			
		}
		Collections.reverse(obj1);
		System.out.println(obj1);
		
		
		

	}

}
