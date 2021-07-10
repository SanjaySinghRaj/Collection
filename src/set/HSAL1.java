package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HSAL1 {

	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add(10);
		obj1.add(10);
		obj1.add(20);
		obj1.add(20);
		obj1.add(20);
		obj1.add(30);
		obj1.add(30);
		System.out.println(obj1);
		System.out.println(obj1.size());
		HashSet obj2=new HashSet(obj1);
		ArrayList obj3=new ArrayList(obj2);
		System.out.println(obj3);
		Collections.sort(obj3);
		System.out.println(obj3);

	}

}
