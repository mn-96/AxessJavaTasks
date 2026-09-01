package java_Basics;

public class inheritFirstParent extends inheritMainGrandParent{
	
	public void company() {
		
		System.out.println("Company for the First parent and their child");
		
	}
	
	public static void main (String[]args) {
		
		inheritFirstParent fpt = new inheritFirstParent();
		
		fpt.company();
		fpt.car();
		
		fpt.v=100;
		fpt.palace();
		System.out.println();
		
	}

}
