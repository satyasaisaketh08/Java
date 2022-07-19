package tute;
import java.util.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int number = sc.nextInt();
		int rev = 0,digit;
		while(number!=0) {
			digit = number%10;
			if (digit == 0) {
//				return 5;
			}else {
//				return 0;
			}
			rev = rev*10 + digit;
			number = number/10;
		}
		System.out.println(rev);
		
	}

}
