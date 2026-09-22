package taskAxess;

public class Control_StatementTask {
	
	public void post(int i) {
		if (i>=0) {
			System.out.println("The given number is +ive");
		}	
	}
	public void postNeg(int i) {
		if (i<=0) {
			System.out.println("The given number is -ive");
		}else {
			System.out.println("The given number is +ive");
		}		
	}
	public void postNegZero(int i) {
		if (i<0) {
			System.out.println("The given number is -ive");
		} else if (i>0) {
			System.out.println("The given number is +ive");
		} else {
			System.out.println("The given number is zero");
		}
	}
	public void weekDay(int i) {
		System.out.print("And the day is ");
		
		switch (i) {
		
		case 1: 
			System.out.println("Sunday");
			break;
		case 2:	
			System.out.println("Monday");
			break;
		case 3:	
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:	
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:	
			System.out.println("Satudrday");
			break;
		default:
			System.out.println("No. out of weekdays");
		}
	}
	public void whileNos(int i, int a) {
		System.out.print("While loop - ");
		while(i<=a) {
			System.out.print(i);
			i++;
		}
		System.out.println("");
	}
	public void doWhileNos(int i, int a) {
		System.out.print("Do While loop - ");
		do {
			System.out.print(i);
			i++;
		} while(i<=a);
		System.out.println("");
	}
	public void forNos(int i, int a) {
		System.out.print("For loop - ");
		for(;i<=a;i++) {
			System.out.print(i);
		}
		System.out.println("");
	}
	public void forEachNos() {
		System.out.print("For each loop - ");
		int [] arl = { 1, 3, 5, 7, 9};
		for (int i : arl) {
			System.out.print(i);
		}
		System.out.println();
	}
	public void loopBreak(int a, int b, int i) {
		System.out.print("For loop and break at "+b+" = ");
		for(; i<=a;i++) {
			System.out.print(i);
			if (i == b) {
				break;
				}
		}
		System.out.println();
	}
	public void loopContinue(int a, int b, int i) {
		System.out.print("For loop and continue (skip) at "+b+" = ");
		for(;i<=a;i++) {
			if (i==b) {
				continue;
			}
			System.out.print(i);{
			}
		}
		System.out.println();
	}
	public String returnIntPostNegZero(int a) {
		if(a>0) {
			return "The number is "+a+" which is +ive";
		} else if (a<0) {
			return "The number is "+a+" which is -ive";
		}
		else {
			return "The number is zero "+a+" which is zero";
		}
	}
	
	public static void main (String[]args) {
		Control_StatementTask cST = new Control_StatementTask();
		cST.post(1);
		cST.postNeg(-1);
		cST.postNegZero(0);
		cST.weekDay(6);
		cST.whileNos(1, 5);
		cST.doWhileNos(1, 5);
		cST.forNos(1, 5);
		cST.forEachNos();
		cST.loopBreak(10, 5, 1);
		cST.loopContinue(10, 5, 1);
		System.out.println(cST.returnIntPostNegZero(0));
	}

}
