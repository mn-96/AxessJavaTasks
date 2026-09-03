package java_Basics;

public class polymorphismMethodOverloading { //method over loading
	
	public int calc(int a, int b) {
		return a+b;
	}
	
	public int calc(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main (String[]args) {
		
		polymorphismMethodOverloading movl = new polymorphismMethodOverloading();
		System.out.println(movl.calc(5, 8));
		System.out.println(movl.calc(8, 9, 12)); //compile polymorphism
	}

}
