package java_Basics;

public class forEachEnhancedLoop {
	
	public static void main (String[]args) {
		int b=0;
		int arr[][] ={ {12, 13, 14,} , {15, 16, 17} , {18, 19, 20}};
		for(int[] row:arr) {   //here we are taking the row of the array
			for (int ele: row) { //here we are taking the element of each row
				System.out.print(ele+" ");
	//			b = arr[][];
			}
			System.out.println();
	//		System.out.println(b);
		}
	}

}
