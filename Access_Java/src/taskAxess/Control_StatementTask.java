package taskAxess;

public class Control_StatementTask {
	
	public void post(int i) {
		if (i>0) {
			System.out.println("The given number is +ive");
		}	
	}
	
	public void postNeg(int i) {
		if (i<0) {
			System.out.println("The given number is -ive");
		}else {
			System.out.println("The given number is +ive");
		}		
	}
	
	public static void main (String[]args) {
		Control_StatementTask cST = new Control_StatementTask();
		cST.post(2);
		cST.postNeg(-1);
	}

}
