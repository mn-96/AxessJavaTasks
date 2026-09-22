package java_Basics;

import java.util.HashMap;

public class collectionsMap {
	
	public static void main(String[]args) {
		HashMap<Integer, Integer> hm = new HashMap <Integer, Integer>();
		hm.put(01, 90);
		hm.put(02, 85);
		hm.put(01, 95);
		hm.put(03, 75);
		hm.put(02, 86);
		System.out.println(hm);
		System.out.println(hm.size());
		System.out.println(hm.containsKey(03));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.remove(3));
		System.out.println(hm);
		hm.put(04, 65);
		System.out.println(hm.containsValue(75));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.getOrDefault(3, 55)); //if value is not there it will give the default value 55
		System.out.println(hm.getOrDefault(2, 45)); //if value is there it will not give the default value 45
		System.out.println(hm.replace(2, 86, 88)); //replaces the old value
		System.out.println(hm);
	}
}
