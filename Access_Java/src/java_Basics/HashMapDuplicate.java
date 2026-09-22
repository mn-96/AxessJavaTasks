package java_Basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicate {
	
	public static void main (String[]args) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int ar[] = {5, 6, 7, 8, 5, 9, 1, 4, 5, 3, 2, 7, 8};
		for(int n:ar) {
			System.out.print(n);
			hm.put(n, hm.getOrDefault(ar, 0)+1);
		}
		System.out.println();
		for(Map.Entry<Integer, Integer>entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getValue());
				break;
			}
		}
	}

}
