package java_Basics;

import java.util.Scanner;

public class basicTasks {
	
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
	
	public static void main(String[]args) {
		basicTasks bT = new basicTasks();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the upcoming event date followed by year ");
		bT.ab = sc.nextByte();
		
		bT.as = sc.nextShort();
		System.out.println("So the event date is on Aug "+bT.ab);
		System.out.println("This event happens after "+bT.as+" years");
				
		System.out.println("Enter the floor");
		bT.aage = sc.nextInt();		
		System.out.println("The event is planned in the "+bT.aage+"th floor");
		
		System.out.println("Enter the event manager phone number is ");
		bT.ag = sc.nextLong();
		
		System.out.println("Enter event estimation ");
		bT.af = sc.nextFloat();
		
		System.out.println("Enter the amount spent ");
		bT.ad =sc.nextDouble();
		
		System.out.println("What is the grade rating u can give for the event");
		bT.ac = sc.next().charAt(0);
		
		if (bT.ag>bT.af) {
			System.out.println("The estimation is higher ");
			bT.wrong = sc.nextBoolean();
		}else
		System.out.println("The estimation is lower ");
		
		System.out.println("The event is taking place in ");
		bT.aplace = sc.next();
		
		System.out.println("The represntative's post in the event is ");
		bT.post = sc.next();
		
	}

}
