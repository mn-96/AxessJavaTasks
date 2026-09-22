package java_Basics;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Word ");
		
		String w = sc.nextLine();
		String rw = "";
		
		for(int i=w.length()-1;i>=0;i--) {
			rw = rw+w.charAt(i);
		}
		System.out.println(rw);
		
	}

}
