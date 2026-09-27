package taskAxess;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task_String_Array {
	
	public void stringCount(String word) {
		int n=0;
		for(int i=0;i<=word.length()-1;i++) {
			n+=1;
		}
		System.out.println("The old word is "+word+", here the total char count is = "+n);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new word");
		String newWord = sc.nextLine();
		int m=0;
		for(int j=0;j<=newWord.length()-1;j++) {
			m+=1;
		}
		System.out.println("The new word is "+newWord+", here the total char count is = "+m);
	}
	public void stringEmpty(String empty) {
		String s="";
		if (s.equals(empty)){
			System.out.println("The string is empty");
		} else {
			System.out.println("The string is not empty");
		}
	}
	public void stringUpper(String up) {
		System.out.println(up.toUpperCase());
	}
	public void stringLower(String low) {
		System.out.println(low.toLowerCase());
	}
	public void stringConcat(String a, String b) {
		System.out.println(a+b);
	}
	public void stringLen(String a) {
		System.out.println(a.length());
	}
	public void stringSub(String sub) {
		System.out.println(sub.contains("day"));
	}
	public void stringRep(String rep) {
		System.out.println(rep.replace('a', 'i'));
	}
	public void stringEq(String a, String b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words");
		a = sc.nextLine();
		b = sc.nextLine();
		if (a.equals(b)) {
			System.out.println("The given words are same");
		} else {
			System.out.println("The given words are not same");
		}
	}
	public void arrRev(int a) {
		int ar[]= {10, 20, 30, 40, 50};
		System.out.println(ar.length);
		for(int j=0;j<=ar.length-1;j++) {
			System.out.print(ar[j]+" ");
		}
		System.out.println();
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	public void arrAdd(int b) {
		int arr[] = {10, 20, 30};
		for(int i=0;i<=arr.length-1;i++) {
			b+=arr[i];
		}
		System.out.println(b);
	}
	public void arrMin(int min) {
		int m[]= {10, 15, 45, 30, 60, 5 , 75};
		min = m[min];
		for (int i=0;i<=m.length-1;i++) {
			if (m[i]<min) {
				min = m[i];
			}
		}
		System.out.println(min);
	}
	public void arrMax(int max) {
		int mn[] = {10, 15, 45, 30, 60, 5 , 25};
		max = mn[max];
		for (int i=0;i<=mn.length-1;i++) {
			if(mn[i]>max) {
				max = mn[i];
			}
		}
		System.out.println(max);
	}
	public void arrChq(int val) {
		int m[] = {10, 15, 45, 30, 60, 5 , 25};
		for (int i=0;i<=m.length-1;i++) {
			if (m[i]==val) {
				System.out.println("Yes");
			}
		}
	}
	public void arrSort(int sort) {
		int m[] = {10, 15, 45, 30, 60, 5 , 25};
		int n[] = {50, 15, 65, 90, 80, 5 , 75};
		Set<Object> s = new TreeSet<Object>();
		for(int i=0;i<=m.length-1;i++) {
			s.add(m[i]);
		}
		System.out.println(s);
		Arrays.sort(n);
		for(int j=0;j<=n.length-1;j++) {
		System.out.print(n[j]+" ");
		}
	}

	public static void main (String[]args) {
		Task_String_Array tSA = new Task_String_Array();
		tSA.stringCount("Today");
		tSA.stringEmpty("");
		tSA.stringUpper("go girl");
		tSA.stringLower("THE END");
		tSA.stringConcat("Traffic", "Lights");
		tSA.stringLen("Love");
		tSA.stringSub("Yesterday");
		tSA.stringRep("Haai");
		tSA.stringEq("Yes", "Yes");
		tSA.arrRev(1);
		tSA.arrAdd(0);
		tSA.arrMin(0);
		tSA.arrMax(0);
		tSA.arrChq(30);
		tSA.arrSort(0);
	}
}
