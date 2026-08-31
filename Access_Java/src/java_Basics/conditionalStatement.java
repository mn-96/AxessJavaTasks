package java_Basics;

public class conditionalStatement {
	
	public static void main (String[]args) {
		
		System.out.println("If Statement");
		int a = 60;
		int b = 40;
		
		if (a>b) {
			System.out.println("The condition is correct");
		} else
			System.out.println("The condition is false");
		
		System.out.println("Else if ladder Statement");
		
		if (b>=90) {
			System.out.println("Grade A");
		} else if (b>=40) {
			System.out.println("Just Pass");
		} else
			System.out.println("Fail");
		
		System.out.println("Switch Statement");
			
		switch(a) {
		
		case 100:
		System.out.println("Distinction");
		
		case 80:
		System.out.println("First Class");
		
		case 60:
			System.out.print("Second Class");
		default:
			System.out.println("Fail");
		
		}
		
//		Greater than 100--->large number
//
//		50-100-->medium number
//
//		1-49--->small number
//
//		0-->Zero
//
//		less than 0--->Negative number
		
		int h = 7;
		
		if (h>100) {
			System.out.println("It is a larger number");
		} else if (h<=100 && h>=50) {
			System.out.println("It is a medium number");
		} else if (h<50 && h>=1) {
			System.out.println("It is small number");
		} else if (h<0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative number");
		}
	}

}
