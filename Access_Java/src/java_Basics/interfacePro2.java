package java_Basics;

public interface interfacePro2 {
	
	public void tropicalRainforest();
	
	public default void mangroveForest() {
		System.out.println("Mangrove Forest is a forest where Trees growing near salty coastal water");
	}
	
	//static methods cannot be called or used in another class
	
	public static void deciduousForest() {
		System.out.println("Deciduous Forest is a forest ");
	}

}
