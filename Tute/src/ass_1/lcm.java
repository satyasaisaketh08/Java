package ass_1;

import java.util.*;

public class lcm {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		int divisor = a;
		int dividenend = b;
		int gcd = 0;
		int lcm = 0;
		while (divisor != 0) {
			int remainder = dividenend % divisor;
			dividenend = divisor;
			divisor = remainder;
		}
		gcd += dividenend;
		lcm = (a * b) / gcd;
		System.out.println(lcm);

	}

}