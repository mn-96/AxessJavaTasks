package java_Basics;

public class interfacedClass implements interfacePro1, interfacePro2 {

	@Override
	public void tropicalRainforest() {
		// TODO Auto-generated method stub
		System.out.println("Tropical rainforests are forests where Lots of rain, very green and dense");
	}

	@Override
	public void jungle() {
		// TODO Auto-generated method stub
		System.out.println("Jungle is a Nature’s wild playground, dense, tangled, and full of life");
	}
	
	public static void main (String[]args) {
		
		interfacedClass ifc = new interfacedClass();
		
		ifc.forest();
		ifc.jungle();
		ifc.tropicalRainforest();
		ifc.mangroveForest();
		
	}

}
