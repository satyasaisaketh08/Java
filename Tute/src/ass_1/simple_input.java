package ass_1;

import java.util.*;

public class simple_input {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0;
		// int vals[]= new int[10];
		for (i = 0; i < 1000; i++) {
			int num = sc.nextInt();
			sum = sum + num;
			if (sum < 0) {
				// System.out.println(num);
				break;
			} else {
				System.out.println(num);
			}
		}
	}
}
