import java.util.*;

public class dec2bin {
	// dec2bin
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long mult = 1;
		long ans = 0;
		while (n > 0) {
			long rem = n % 2;
			ans = ans + rem * mult;
			mult = mult * 10;
			n = n / 2;
		}
		System.out.println(ans);
	}
}
