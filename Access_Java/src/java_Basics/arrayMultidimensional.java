package java_Basics;

public class arrayMultidimensional {
	
	public static void main (String[]args) {
		int ar[]= {12, 13, 14, 15, 16, 17, 18, 19, 20};
		int arr[][] ={ {12, 13, 14,} , {15, 16, 17} , {18, 19, 20}};
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		System.out.println();
		
		int l=0;
		
		for (int j=0;j<arr.length;j++) {
			for (int k=0; k<arr.length;k++) {
				System.out.print(arr[j][k]+" ");
				l=l+arr[j][k];
			}
			System.out.println();
		}
		System.out.println("Total of Multi Dimensional Arrays "+l);
	}

}
