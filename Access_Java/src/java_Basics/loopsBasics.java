package java_Basics;

public class loopsBasics {
	
	public static void main (String[]args) {
		
		System.out.println("For loop");
		
		int m = 5;
		
		for (int i=1; i<=m; i++) {
			System.out.println(i);
		}
		
		System.out.println("While loop");
		
		int j=1;
		
		while (j<=m) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("Do While loop");
		
		int k = 1;
		
		do {
			System.out.println(k);
			k++;
		} while (k<=m);
		
		System.out.println("Reverse loop - for");
		
		for (int i=10; i>=m; i--) {
			System.out.println(i);
		}
		
		System.out.println("Reverse loop - While");
		
		int j1 = 11;
		
		while (j1>=m) {
			System.out.println(j1);
			j1--;
		}
		
		System.out.println("Reverse loop - Do While");
		
		int k1=12;
		
		do {
			System.out.println(k1);
			k1--;
		} while (k1>=m);
		
		
	}

}
