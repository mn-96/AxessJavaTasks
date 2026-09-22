package taskAxess;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBasicTask {
	
	public static void main (String[]args) {
		
		Set<Object> jS = new HashSet<>();
		jS.add("Vijay");
		jS.add("Ajith");
		jS.add("Suriya");
		jS.add("Vikram");
		jS.add("Dhanush");
		jS.add("STR");
		
		Set<Object> sS = new LinkedHashSet<>();
		sS.add("Vijay");
		sS.add("Rajni");
		sS.add("Kamal");
		sS.add("Ajith");
		sS.add("Ravi");
		sS.add("Jiiva");
		
//		jS.retainAll(sS);
//		System.out.println("Students learn both Java And Selenium "+jS);
		
		Set<Object> tS = new TreeSet<>();
		tS.addAll(jS);
		System.out.println("Student name is Alphabetical order in Java "+tS);
		tS.addAll(sS);
		System.out.println("Student name is Alphabetical order in Java and Selenium "+tS);
		
		jS.addAll(sS);
		System.out.println("Duplicates removed and these are the students of Java or Selenium (i.e,) all the students ");
		System.out.println(jS);
		jS.removeAll(sS);
		System.out.println("Students Learn Only Java "+jS);
	//	System.out.println("Students Learn Only Java but not Selenium "+jS);
		
		ArrayList<Object> s = new ArrayList<>(tS);
		
		for(int i=0; i<s.size();i++) {
			System.out.print(s.get(i)+" ");
		}
	}


}
