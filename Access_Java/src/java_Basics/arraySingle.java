package java_Basics;

public class arraySingle {
	
	public static void main (String[]args) {
		
		int n[] = {1,3,5,7,9};
		System.out.println(n[4]);
		
		int k=0;
		for (int i=0;i<=n.length-1;i++) { //in array while using length () is not req
			System.out.print(n[i]);
			k+=n[i];
		}
		System.out.println();
		System.out.println(k);
		
		for (int j=n.length-1; j>=0; j--) {
			System.out.print(n[j]);
		}
		
	}

}
