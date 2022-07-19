package tute;

import java.util.*;

public class fibbonaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int limit = sc.nextInt();
		int count = 1;
		int a = 0;
		int b = 1;

		while (count <= limit) {
			int c = a + b;
			System.out.println(a);
			a = b;
			b = c;
			count++;
		}
	}
}
