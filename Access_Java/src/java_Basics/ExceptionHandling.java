package java_Basics;

public class ExceptionHandling {
	
	public static void main (String[]args) {
		
		int i[]= {5, 15, 25, 35};
		
		try {
			System.out.println(i[4]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Index value is not valid");
		}
		
		try {
		
		int n = 10/0;
		}
		catch (ArithmeticException f){
			System.out.println("There is a calcuation error pls check");
		}
		
//		System.out.println("All the exceptions are handled");
		finally {
			System.out.println("All the exceptions are handled");
		}
	}

}
