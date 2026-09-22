package taskAxess;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListArraySetDuplicate {
	
	public static void main (String[]args) {
		
		Integer[]ar = {50, 60, 70, 50, 80, 70, 90, 60, 80, 50, 40};
		for(int i=0;i<=ar.length-1;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println(ar[3]);
		
		Set<Object> ls = new LinkedHashSet<Object>();
		Set<Object> dls = new LinkedHashSet<Object>(); //this is to add the repeated values
		for(int i=0;i<=ar.length-1;i++) {
			if(!ls.add(ar[i])) {
				dls.add(ar[i]);
			}
		}
		System.out.println("Uniques are "+ls);
		System.out.println("Duplicates are "+dls);
		
		Set<Object> fd = new LinkedHashSet<Object>();    
		Set<Object> rfd = new LinkedHashSet<Object>();
		for(int i=0;i<=ar.length-1;i++) {
			if(!fd.add(ar[i])) {
				rfd.add(ar[i]);     //this is to stop when the first duplication occurs
				break;
			}
		}
		
		System.out.println("First repeated value is "+rfd);
		
		//Array to List
		
		List<Integer>n = Arrays.asList(ar);
		System.out.println(n);
		System.out.println(n.size());
		
		for(int i=0;i<=n.size()-1;i++) {
			System.out.print(n.get(i)+" ");
		}
		System.out.println();
		
		//List to Set
		
		Set<Object>s= new TreeSet<Object>(n);
		System.out.println(s);
	}
}
