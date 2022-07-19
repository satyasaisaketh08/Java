package ass_1;

import java.util.*;

public class sumof_oddeven_placed_digits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int odd_sum = 0;
		int even_sum = 0;
		int digit = 0;
		while (num > 0) {
			digit = num % 10;
			odd_sum += digit;
			num /= 10;
			digit = num % 10;
			even_sum += digit;
			num /= 10;
		}
		System.out.println(odd_sum);
		System.out.println(even_sum);
	}
}
