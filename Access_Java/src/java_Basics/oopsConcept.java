package java_Basics;

class data{
	
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	private String mailID;
	
	public void setMailID(String mailID) {
		this.mailID=mailID;
	}
	
	public String getMailID() {
		return mailID;
	}
	
}

public class oopsConcept extends inheritFirstChildOfFirstParent implements interfacePro1, interfacePro2 {

	public static void main (String[]args) {
		
		oopsConcept oC = new oopsConcept();
		data d = new data();
		oC.jungle();
		oC.bikes();
		oC.car();
		oC.forest();
		oC.company();
		d.setNumber(98);
		System.out.println(d.getNumber());
	}

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
	
}
