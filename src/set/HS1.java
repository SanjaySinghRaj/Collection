package set;

import java.util.HashSet;

public class HS1 {

	public static void main(String[] args) {
		HashSet obj1 =new HashSet();
        System.out.println(obj1.size());
        System.out.println(obj1.isEmpty());
        obj1.add(10);
        obj1.add(20);
        obj1.add('a');
        obj1.add("Hello");
        obj1.add(29.2f);
        obj1.add(10);
        System.out.println(obj1);
        System.out.println(obj1);
        for (Object e : obj1) {
        	System.out.println(e);
			
		}
        obj1.remove(10);
        obj1.remove('a');
        System.out.println(obj1);
        obj1.clear();
        System.out.println(obj1);
	}

}
