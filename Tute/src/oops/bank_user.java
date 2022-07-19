package oops;

public class bank_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank u1 = new bank("Saketh",1000); 
		System.out.println(u1.getbalance());
		u1.withdraw(100);
		System.out.println(u1.getbalance());

	}

}
