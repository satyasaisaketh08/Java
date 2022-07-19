package ass_1;

import java.util.*;

public class nth_fib {
	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int a = 0;
		int b = 1;
		int sum = 0;
		while (count <= n) {
			int c = a + b;
			// System.out.println(c);
			a = b;
			b = c;
			count++;
		}
		System.out.println(a);
	}
}
