package taskAxess;

public class ConditionalLoop_Tasks {
	
	public void postNeg(int i){
		if(i>0) {
			System.out.println("The number is +ive");
		} else if (i<0) {
			System.out.println("The number is -ive");
		}else {
			System.out.println("The number zero");
		}
	}
	public void oddEven(int i) {
		if(i%2==0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
	public void vowelConsonant(char ab) {
		char og = ab;
		ab = Character.toLowerCase(ab);
		if(ab == 'a'|| ab== 'e'|| ab == 'i'|| ab== 'o'|| ab =='u') {
			System.out.println("The Alphabet "+ og +" is a Vowel");
		} else {
			System.out.println("The Alphabet "+og+" is a Consonant");
		}
	}
	public void grade(int m) {
		if(m<=100 && m>=90) {
			System.out.println("Mark Attained is "+m+", Hence the grade is A");
		}else if(m<=89 && m>=80) {
			System.out.println("Mark Attained is "+m+", Hence the grade is B");
		} else if(m<=79 && m>=70) {
			System.out.println("Mark Attained is "+m+", Hence the grade is C");
		} else if(m<=69 && m>=60) {
			System.out.println("Mark Attained is "+m+", Hence the grade is D");
		} else if (m<60) {
			System.out.println("Mark Attained is "+m+", Hence the grade is F");
		} else {
			System.out.println("Mark Attained is "+m+", Which is Invalid");
		}
	}
	public void vote(int age) {
		if(age>=18) {
			System.out.println("The Age is "+age+", Hence Eligible to Vote");
		} else {
			System.out.println("The Age is "+age+", HenceNot Eligible to Vote");
		}
	}
	public void largeSmall(int a, int b) {
		if (a>b) {
			System.out.println("The given number a is "+a+", which is greater than b which is "+b);
		} else {
			System.out.println("The given number b is "+b+", which is greater than a which is "+a);
		}
	}
	public void leap(int year) {
		if(year%4==0) {
			System.out.println("The given year is "+year+", which is a leap year");
		} else {
			System.out.println("The given year is "+year+", which is not a leap year");
		}
	}
	public void for10(int a, int i) {
         for (;i<=a;i++) {
        	 System.out.print(i+" ");
         }
         System.out.println("");
	}
	public void sumNaturalNum(int n, int i) {
		int a=i;
		for(;i<=n;i++){
			a+=i;
		}
		System.out.println("The given number is "+n+", hence the sum of first "+n+" natural numbers are "+a);
	}
	public void stringChar(String s) {
		String[] c = s.split("");
		System.out.println(c.length);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	public void reverseString(String s) {
		String rev = ("");
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	public void fact(int n) {
		int f = 1;
		for (int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
	public void multiply(int m, int n) {
		for(int i=1; i<=n;i++) {
			int a=i*m;
			System.out.println(m+" x "+i+" = "+a);
		}
	}
	public void odd10(int o, int n, int t) {
		System.out.println("First "+o+" Odd nos. are");
		for(int i=1; i<=t; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				n+=1;
			}
			if(n==o) {
				break;
			}
		}
		System.out.println("");
	}
	public void numReverse(int n, int m) {
		System.out.println("Reverse nos. from "+n+" to "+m);
		for(;n>=m;n--) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	public void cumulativeSum(int m, int n, int f) {
		for(int i=1;i<=n;i++) {
			f=f+i;
			System.out.print(f+" ");
			if(i==m) {
				break;
			}
		}
		System.out.println();
	}
	public void fibonacci(int m, int n) {
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i=1;i<=n;i++) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
			if(i==m) {
				break;
			}
		}
		System.out.println();
	}
	public void primeNum(int n){
		if(n<2) {
			System.out.println("The number "+n+" is not a prime");
			return;
		}else {
			for(int p=2;p<=n/2;p++) {
				if(n%p==2) {
				System.out.println("The number "+n+" is not a prime");
			return;	
			}
			System.out.println("The number "+n+" is a prime");
			return;
			}
		}
	}
	public static void main (String[]args) {
		ConditionalLoop_Tasks clt = new ConditionalLoop_Tasks();
		clt.postNeg(5);
		clt.oddEven(9);
		clt.vowelConsonant('M');
		clt.grade(77);
		clt.vote(23);
		clt.largeSmall(75, 85);
		clt.leap(2024);
		clt.for10(10, 1);
		clt.sumNaturalNum(5, 0);
		clt.stringChar("Today");
		clt.reverseString("Yesterday");
		clt.fact(5);
		clt.multiply(6, 10);
		clt.odd10(10, 0, 100);
		clt.numReverse(10, 1);
		clt.cumulativeSum(15, 100, 0);
		clt.fibonacci(10, 100);
		clt.primeNum(143);
	}

}
