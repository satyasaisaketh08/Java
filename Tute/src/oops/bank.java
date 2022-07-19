package oops;

public class bank {
	
	private String name;
	private int balance;
	
	public bank(String N,int B) {
		name = N;
		balance = B;
	}
	
	public int getbalance() {
		return this.balance;
	}
	
	public void withdraw(int amount) {
		int remaining  = (this.balance - amount);
		System.out.println("Your balance after withdrawing" + amount + "is"+remaining);
	}

}
