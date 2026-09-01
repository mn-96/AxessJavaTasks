package java_Basics;

public class inheritMainGrandParent {
	
	int v;
	
	public void palace() {
		
		System.out.println("Large Palace for all the family members, for "+v+" years");
		
	}
	
	public void car() {
		
		System.out.println("Hi-tech and classic model cars");
		
	}
	
	public static void main(String[]args) {
		
		inheritMainGrandParent mgpt = new inheritMainGrandParent();
		
		
		mgpt.car();
		mgpt.palace();
		
	}

}
