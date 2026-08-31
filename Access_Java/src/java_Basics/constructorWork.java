package java_Basics;

public class constructorWork {
	
	public constructorWork() {
		this("String");
		System.out.println("Without param");
	}
	
	public constructorWork(int a) {
		this(10,11);
		System.out.println("Single param");
	}
	
	public constructorWork(int a, int b) {
		System.out.println("Double param");
	}
	
	public constructorWork(String name) {
		this(5);
		System.out.println("String Param");
	}
	
	public static void main (String[]args) {
		
		constructorWork con = new constructorWork();
		
	}

}
