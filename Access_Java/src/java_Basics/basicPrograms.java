package java_Basics;

public class basicPrograms {
	
	byte b = 127;
	short s = 31008;
	int age = 29;
	long g = 98989656462L;
	float f = 58.23f;
	double d = 5896.0058;
	char c = 'm';
	boolean correct = true;
	String name = "jack";
	static String place = "chennai";
	
	byte ab;
	short as;
	int aage;
	long ag;
	float af;
	double ad;
	char ac;
	boolean wrong;
	String aplace;
	static String post;
	
	public void m() {
		int n = 99;
		System.out.println(n);
	}
	
//	public void am() {
//		int an = 0;
//		System.out.println(an);
//	}
//	
	
	public static void main (String[]args) {
		
		System.out.println("Hi");
		basicPrograms bp = new basicPrograms();
		System.out.println("Age ="+bp.age);
		System.out.println("Byte ="+bp.b);
		System.out.println("Long ="+bp.g);
		System.out.println("FLoat ="+bp.f);
		System.out.println("Double ="+bp.d);
		System.out.println("Char ="+bp.c);
		System.out.println("Boolean value ="+bp.correct);
		System.out.println("Name ="+bp.name);
		System.out.println(place);
		bp.m();
		
		System.out.println(bp.ab=(byte)5);
		System.out.println("This event happens after "+bp.as+" year");
		System.out.println("The event is on "+bp.aage+"th floor");
		System.out.println("The event manager number is "+bp.ag);
		System.out.println("The total event estimation is "+bp.af);
		System.out.println("The amount spent is "+bp.ad);
		System.out.println("This event is "+bp.ac+"grade");
		if (bp.ag>bp.af) {
			System.out.println("The estimation is correct "+bp.correct);
		}else
		System.out.println("The estimation is correct "+bp.wrong);
		System.out.println("The event is taking place in "+bp.aplace);
		System.out.println("The represntative's post in the event is "+post);
		
	}

private String ab(byte e) {
	// TODO Auto-generated method stub
	return null;
}


}
