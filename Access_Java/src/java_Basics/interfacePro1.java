package java_Basics;

public interface interfacePro1 {
	
	public void jungle();
	
	public default void forest() {
		System.out.println("Forest is a Nature’s organized home, where trees and life grow together");
	}

}
