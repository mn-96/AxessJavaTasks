package java_Basics;

public class operatorsTask {
	
	public static void main (String[]args) {
		
		System.out.println("Arithmetic Operator");
		
		int a=5;
		int b=6;
		int c=a+b;
		
		System.out.println("Addition '+' of two numbers "+(a+b));
		System.out.println("Subraction '-' of two numbers "+(b-a));
		System.out.println("Multiplication '*' of two numbers "+(a*b));
		System.out.println("Division '/' of two numbers to get quotient "+(c/a));
		System.out.println("Division '%' of two numbers to get remainder "+(b%a));
		
		System.out.println("Logical Operator");
		
		int d = c+a+b;
		int e = 18;
		
		System.out.println("Only the people of age >= 18 alone can vote, here the age of the boy is "+d);
		if (d>=e) {
			System.out.println("Eligible to Vote");
		} else
		System.out.println("Not eligible to vote");
		
		int f=d+e;
		
		int h[] = {1, 13, 26, 39, 52, 65};
		System.out.print("Value of f is == "+f);
		
		if (f==h[3]) {
			System.out.println("The third index value of h matches the value of f "+h[3]);
		} else {
			System.out.println("The third index value of h doesn't matches the value of f");
		}
		
		int g=e+f;
		
		System.out.println("The mark obtained by the student is "+g);
		System.out.println("Hence the class acquired is ");
		
		if (g<=100 && g>90) {
			System.out.println("Distinction");
		} else if (g<=90 && g>70) {
			System.out.println("First Class");
		} else if (g<=70 && g>40) {
			System.out.println("Just Pass");
			System.out.println("Because Just Pass Comes under condition Mark obatained <=70 && >40");
		} else {
			System.out.println("Fail");
		}
		
		int k=h.length;
		
		if(k!=a) {
			System.out.println("The condition is passed the value of k is "+k+" and the value of a is "+a);
			System.out.println("The condition used here is !=");
		}
		System.out.println("The value of g is "+g+" and the value of f is "+e);
		if(g>=40 || e>40 ) {
			System.out.println("Then the man is middle aged");
		}
		
		boolean correct = true;
		System.out.println("Inverse of true is "+!correct);
		
//		for (int i=1;i<=n;i++) {
//			
//		}
		
		
	}
	
	

}
