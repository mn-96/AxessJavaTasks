package java_Basics;

public class inheritSecondParent extends inheritMainGrandParent{
	
	public void farm() {
		
		System.out.println("Farmland for Second Child and Family");
	}
	
	public static void main(String[]args) {
		
		inheritSecondParent spt= new inheritSecondParent();
		
		spt.v=75;
		spt.palace();
		spt.car();
		spt.farm();
	}

}
