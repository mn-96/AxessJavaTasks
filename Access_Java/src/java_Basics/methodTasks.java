package java_Basics;

public class methodTasks {
	
	public void greeting() {
		System.out.println("Welcome to the event");
	}
	
	public int addition(int a,int b) {
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
		return a+b;
	}
	
	public void maximumnumber(int c, int d) {
		if (c>d) {
			System.out.println("c "+c+" is greater than d "+d);
		}else {
			System.out.println("d "+d+" is greater than c "+c);
		}	
	}
	
	int g;
	public void squareof(int e) {
		for(int f=0;f<=e;f++) {
			g=f*e;			
		}
		System.out.println("Square of "+e+" is"+" "+g);
	}
	
	int f=1;
	public void factorial(int h) {
		for(int j=1;j<=h;j++) {
			f=f*j;			
		}
		System.out.println("Factorial of "+h+" is"+" "+f);
	}
	
	public int oddoreven(int k) {
		if (k%2==0) {
			System.out.println("The given number "+k+" is even");
		}else {
			System.out.println("The given number "+k+" is odd");
		}
		return k;
	}
	
	public void prime(int l) {
		if (l<=1) {
			System.out.println("The number "+l+" is not prime");
		} else {
			for (int p=2;p<=l/2;p++) {
				if(l%p==0) {
				System.out.println("The number "+l+" is not prime");
				return;
			} 
		}
			System.out.println("The number is prime");
			return;
		}	
	}
	
	public void palindrome(int q) {
		int t=q;
		int r=0;
		while(q!=0) {
			int s=q%10;
			r=r*10+s;
			q=q/10;
		}
		System.out.println(r);
		
		if(t==r) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}
	
	public void areaofcircle(int r) {
		double pi =3.14;
		double area = pi*r*r;
		System.out.println("The area of the circle is "+area);
	}
	
	public void listofnumbers(int u) {
		int v = 0;
		int t = 1;
		
		for (int x=0;x<u;x++) {
			v = v+t;
			System.out.print(v+" ");
		}
		System.out.println("Total numbers are "+v);
	}
	
	public void fibonacci(int y) {
		int z= 0;
		int a1=1;
		for (int i=0;i<y;i++) {
			System.out.print(z+" ");
			int b1 = z+a1;
			z = a1;
			a1 = b1;
		}
		System.out.println();
	}
	
	public void reverseString(String name) {
		
		System.out.println(name);
		String rev = "";
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.print(rev);
		System.out.println();
		System.out.println(name.equals(rev));
		System.out.println(name.equalsIgnoreCase(rev));
	}
	
	public static void main (String[]args) { 
		
		methodTasks mT = new methodTasks();
		
		mT.greeting();
		mT.addition(25, 35);
		mT.maximumnumber(65, 55);
		mT.squareof(6);
		mT.factorial(7);
		mT.oddoreven(134);
		mT.prime(141);
		mT.palindrome(15951);
		mT.areaofcircle(5);
		mT.listofnumbers(10);
		mT.fibonacci(10);
		mT.reverseString("Malayalam");
	}

}
