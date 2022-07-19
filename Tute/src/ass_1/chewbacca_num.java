package ass_1;

import java.util.*;

public class chewbacca_num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long reverse = 0;
		long count = 0;

		while (x > 9) {
			long last = x % 10;
			long value = 1;
			for (long i = 0; i < count; i++) {
				value = value * 10;
			}
			count++;
			if (last > (9 - last)) {
				reverse = reverse + (value * (9 - last));
			} else
				reverse = reverse + (value * last);

			x = x / 10;
		}
		long value = 1;
		for (long i = 0; i < count; i++) {
			value = value * 10;
		}

		if (x > (9 - x) && x != 9) {
			reverse = reverse + (value * (9 - x));
		} else
			reverse = reverse + (value * x);

		System.out.println(reverse);

	}
}
