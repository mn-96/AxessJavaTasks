package java_Basics;

public class methodTypes {
	
	int c =10;
	
	public void withoutparam() {
		System.out.println("No Parameter");
	}
	
	public int returnwithoutparam() {
		System.out.println("Value of c is"+c);
		return c; //return statement always comes last - return is to skip or stop the execution of the ongoing method, goes next
	}
	
	public void withparamwithoutreturn(int a,int b) {
		System.out.println(a+b);
	}
	
	public int withparamwithreturn(int d,int f) {
		int e = f+d;
		System.out.println(e);
		return e;
	}
	
    public void stringname(String m) {
		
		System.out.println(m);
		
	}
	
	
	public static void main (String[]args) {
		methodTypes mt = new methodTypes();
		
		mt.withoutparam();
		mt.returnwithoutparam();
		mt.withparamwithoutreturn(10,20);
		mt.withparamwithreturn(25,35);
		mt.stringname("India");
	}

}
