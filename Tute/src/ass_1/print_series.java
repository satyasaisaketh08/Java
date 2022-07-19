package ass_1;

import java.util.*;

public class print_series {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int i = 1;
		int count = 0;
		while (n1 != count) {
			int temp = (3 * i) + 2;
			if (temp % n2 != 0) {
				System.out.println(temp);
				count++;
			}
			i++;
		}
	}
}
