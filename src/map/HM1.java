package map;

import java.util.HashMap;



public class HM1 {

	public static void main(String[] args) {
		HashMap h1=new HashMap();
		h1.put("sundra", 9988776655l);
		h1.put("sundre", 9988776654l);
		h1.put("macha", 9788776655l);
		h1.put("machi", 9788776654l);
		h1.put("dinga", 9988776655l);
		h1.put("dinge", 9988776655l);
		System.out.println(h1);
		System.out.println(h1.get("sundra"));
		System.out.println(h1.containsValue(9988776655l));
		System.out.println(h1.containsKey("sundr"));
		System.out.println(h1.entrySet());
		for (Object o :h1.entrySet() ) {
			System.out.println(o);
		}
		
		
		
	}
	


}

