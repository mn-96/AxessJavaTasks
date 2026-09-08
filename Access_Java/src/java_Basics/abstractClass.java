package java_Basics;

abstract class payment{  //keyword abstract changes the normal class into abstract class
	public abstract void pay();
}

class gpay extends payment{
	public void pay() {
		System.out.println("Paid through GPay");
	}
}

class phonepe extends payment{
	public void pay() {
		System.out.println("Paid through phonePe");
	}
}

public abstract class abstractClass { //keyword abstract changes the normal class into abstract class
 
	public static void main(String[]args) {
		
		payment g = new gpay();
		payment p = new phonepe();	
		g.pay();
		p.pay();
	}
	
	
	
	
	
}
