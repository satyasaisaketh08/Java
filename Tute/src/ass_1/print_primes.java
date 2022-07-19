package ass_1;
import java.util.Scanner;
public class print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		for (int i=2; i<=limit; i++) {
			boolean is_prime = true;
			for (int j=2; j<i; j++) {
				if (i%j == 0) {
					is_prime =  false;
					break;
				} 
			}
			if(is_prime) {
				System.out.println(i);
			}
		}
	}

}
