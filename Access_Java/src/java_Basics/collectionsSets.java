package java_Basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class collectionsSets {

	public static void main (String[]args) {
		
		Set<Object> hs = new HashSet<>();
		
		hs.add("Thalapathy");
		hs.add("Vijay");
		hs.add("Joseph");
		hs.add("CM of Tamilnadu");
		hs.add(1);
		hs.add("Vijay");
		
		System.out.println("HashSet is not a sorted one and not in insertion order and accepts different datatype");
		System.out.println(hs);
		System.out.println(hs.contains("Vijay"));
		System.out.println(hs.size());
		hs.remove("Thalapathy");
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		hs.equals(hs);
		System.out.println(hs.equals(hs));
		System.out.println(hs.getClass());
		System.out.println(hs.containsAll(hs));

		
		Set<Object> ts = new TreeSet<>();
		ts.add("Thalapathy");
		ts.add("Vijay");
		ts.add("Joseph");
		ts.add("CM of Tamilnadu");
		ts.add("V");
		ts.add("vijay");
		
		System.out.println("TreeSet is sorted in Ascending and does not accepts different datatype");
		System.out.println(ts);
		System.out.println(ts.size());
		
		ts.remove("vijay");
		
		System.out.println(ts);
		System.out.println(ts.contains("V"));
		System.out.println(ts.equals(hs));
		System.out.println(ts.equals(ts));
		ts.clear();
		System.out.println(ts);
		System.out.println(ts.equals(hs));
		System.out.println(ts.getClass());
		
		Set<Object> ls = new LinkedHashSet<>();
		ls.add("Thalapathy");
		ls.add("Vijay");
		ls.add("Joseph");
		ls.add("CM of Tamilnadu");
		ls.add(1);
		ls.add("Vijay");
		
		System.out.println("Linked HashSet follows the insertion order and accepts different datatype");
		System.out.println(ls);
		System.out.println(ls.size());
		ls.remove(1);
		System.out.println(ls);
		System.out.println(ls.contains("Vijay"));
		ls.clear();
		System.out.println(ls);
		System.out.println(ls.isEmpty());
		System.out.println(ls.getClass());
		System.out.println(ls.equals(ts));
		
		System.out.println("Sets are not supporting - 'set, get, addFirst, addLast, removeFirst, removeLast, indexOf'");
	}
	
}
