package java_Basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class collectionsList {
	
	public static void main (String[]args) {
		
		System.out.println("Array List");
		
		ArrayList<Object> arl = new ArrayList<>();
		arl.add(1);
		arl.add("Manchunathan");
		System.out.println(arl);
		arl.add("29.90");
		System.out.println(arl);
		arl.add(36.606);
		System.out.println(arl);
		arl.set(3, "hello");
		System.out.println(arl);
		arl.remove(2);
		System.out.println(arl);
		System.out.println(arl.contains(1));
		System.out.println(arl.indexOf("Manchunathan"));
		System.out.println(arl.size());
		arl.clear();
		System.out.println(arl);
		System.out.println(arl.size());
		System.out.println(arl.isEmpty());
		
		System.out.println("Linked List");
		
		LinkedList<Object> lkl = new LinkedList<>();
		lkl.add(1);
		lkl.add("MN");
		System.out.println(lkl);
		lkl.add("This is LinkedList");
		System.out.println(lkl);
		lkl.add(987562365);
		System.out.println(lkl);
		lkl.set(3, "bye");
		System.out.println(lkl);
		lkl.remove(2);
		System.out.println(lkl);
		System.out.println(lkl.contains(2));
		System.out.println(lkl.indexOf("MN"));
		System.out.println(lkl.size());
		lkl.addFirst("Good");
		System.out.println(lkl);
		lkl.addLast("Next");
		System.out.println(lkl);
		System.out.println(lkl.size());
		lkl.removeFirst();
		System.out.println(lkl);
		lkl.removeLast();
		System.out.println(lkl);
		System.out.println(lkl.getFirst());
		System.out.println(lkl.getLast());
		lkl.clear();
		System.out.println(lkl); 
		lkl.addFirst("Good");
		System.out.println(lkl);
		
		ArrayList<Object> arlo = new ArrayList<>();   // <> - this wrapper class alias angular classic
		arlo.add("Hi");
		arlo.add(9);
		arlo.add(987654321);
		arlo.add(66.666);
		arlo.add('M');
		System.out.println(arlo);
		int n=0;
		for (int i=0; i<arlo.size(); i++) {
			System.out.println(arlo.get(i));
			n++;
		}
		System.out.println("Total elements in ArrayList is "+n);
	}

}
