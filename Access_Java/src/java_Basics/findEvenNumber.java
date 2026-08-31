package java_Basics;

public class findEvenNumber {
	
	public static void main(String[]args) {
		
		int m=0;
		int ar[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int arr[][]= { {11, 13, 16, 18}, {24, 56, 51, 33} , {98, 74, 82, 53 }, {59, 58, 62, 15}};
		
		for(int n=0;n<=ar.length-1;n++){
		if (ar[n]%2==0) {
			m+=1;
		}
		}
		System.out.println(m);
		
		System.out.println("The even numbers are");
		int l=0;
		
		for(int o=0;o<=arr.length-1;o++) {
			for(int p=0; p<=arr.length-1;p++) {				
				if(arr[o][p]%2==0) {
					System.out.print(arr[o][p]+" ");
					l+=1;
				}
			}
			System.out.println();
		}
		System.out.println("The total even numbers in the 2D array are "+l);
	}

}
