package java_Basics;

class cook{
	public void kitchen() {
		System.out.println("A person who prepares food");
	}
}

class chef extends cook {
	public void kitchen() {
		System.out.println("A trained professional who prepares food");
	}
}

public class polyMethodOverriding {
	
	public static void main (String[]args) {
		
//		cook cf = new cook();
		cook c = new chef(); //runtime polymorphism
		c.kitchen();
//		cf.kitchen();
	}

}
