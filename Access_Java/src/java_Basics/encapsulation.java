package java_Basics;

public class encapsulation {
	
	public static void main (String[]args) {
		bank b = new bank();
		b.balance(35999.90);
		System.out.println(b.getbalance());
		b.balance(1000);
		System.out.println(b.getbalance());
	}

}

class bank{
	
	private double balance;
	
	public void balance(double amount) {
		balance = balance+amount;
	}
	
	public double getbalance() {
		return balance;
	}
	
}