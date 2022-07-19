package tute;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int number = sc.nextInt();
		int rev = 0,digit;
		while(number!=0) {
			digit = number%10;
			rev = rev*10 + digit;
			number = number/10;
		}
		System.out.println(rev);
		
	}

}
