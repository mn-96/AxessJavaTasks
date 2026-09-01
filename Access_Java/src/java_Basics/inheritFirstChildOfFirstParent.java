package java_Basics;

public class inheritFirstChildOfFirstParent extends inheritFirstParent{
	
	public void bikes() {
		
		System.out.println("Bike for First Child of First Parent");
		
	}
	
	public static void main (String[]args) {
		
		inheritFirstChildOfFirstParent fcfpt = new inheritFirstChildOfFirstParent();
		
		fcfpt.v=25;
		fcfpt.palace();
		fcfpt.company();
		fcfpt.bikes();
		
	}

}
