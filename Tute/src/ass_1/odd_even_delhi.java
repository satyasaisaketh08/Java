package ass_1;

import java.util.*;

public class odd_even_delhi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long tc = sc.nextLong();
		for (int i = 0; i < tc; i++) {
			long num = sc.nextLong();
			int even_sum = 0;
			int odd_sum = 0;
			while (num > 0) {
				long digit = num % 10;
				num = num / 10;
				if (digit % 2 == 0) {
					even_sum += digit;
				} else {
					odd_sum += digit;
				}
			}
			if (even_sum % 4 == 0 || odd_sum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}
