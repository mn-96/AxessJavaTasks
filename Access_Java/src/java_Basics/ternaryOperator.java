package java_Basics;

public class ternaryOperator {
	
	public static void main (String[]args) {
		
		int age = 29;
		System.out.println("The voter age is "+age);
		if (age>17) {
			System.out.println("Valid Voter");
		}
			else {
				System.out.println("Invalid");
			}
			
		String validation = (age>18)?"Valid":"Invalid";
		System.out.println(validation);
		
	}

}
