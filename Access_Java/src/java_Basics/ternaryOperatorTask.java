package java_Basics;

public class ternaryOperatorTask {
	
	public void oddEven(int num){
		System.out.println("Even or odd");
		String check = num%2==0?"Even":"Odd";
		System.out.println("The given number is "+num+" which is "+check);
	}
	
	public void grade(int mark) {
		
		System.out.println("Grade assign based on mark");
		String grade = mark<=100 && mark>80?"A":mark<=80 && mark>60?"B":mark<=60 && mark>=40?"C":"F";
		
		System.out.println("Mark attained is "+mark+", Hence the grade is "+grade);
	}
	
	public void min(int a,int b, int c) {
		
		System.out.println("Minimum number");
		String min = a<b && a<c?"Minimum is a "+a: b<a && b<c?"Minimum is b "+b:"Minimum is c "+c;
		System.out.println(min);
	}
	
	public void leapYear(int year) {
		
		System.out.println("Leap Year");
		String leap = year%4==0?"Leap year":"Not a leap year";
		System.out.println("The given year is "+year+", Which is a "+leap);
	}
	
	public void negOrPos(int n){
		
		System.out.println("Postive or Negative");
		String numb = n<0?"Negative":"Positive";
		System.out.println("The given number is "+n+", Hence it is "+numb);
		
	}
	
	public void absolute(int h) {
		
		System.out.println("Absolute value");
		int abs = h<0?h*-1:h;
		System.out.println("Absolute value of given number "+h+" is "+abs);
		
	}
	
	public static void main (String[]args) {
		
		System.out.println("Ternary Tasks");
		
		ternaryOperatorTask tOT = new ternaryOperatorTask();
		tOT.oddEven(17);
		tOT.grade(61);
		tOT.min(8, 9, 7);
		tOT.leapYear(2020);
		tOT.negOrPos(-2);
		tOT.absolute(-6);
	}

}
