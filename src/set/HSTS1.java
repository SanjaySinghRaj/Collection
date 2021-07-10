package set;

import java.util.HashSet;
import java.util.TreeSet;

public class HSTS1 {

	public static void main(String[] args) {
		HashSet obj1=new HashSet();
		obj1.add(10);
		obj1.add(-10);
		obj1.add(2);
		obj1.add(25);
		obj1.add(20);
		System.out.println(obj1);
		TreeSet obj2=new TreeSet(obj1);
		System.out.println(obj2);

	}

}
