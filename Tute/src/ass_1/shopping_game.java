package ass_1;

import java.util.*;
import java.lang.Math;

public class shopping_game {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			int count1 = 0;
			int count2 = 0;

			for (int j = 1; j < 1000; j++) {
				if (j * j <= M)
					count1++;
				if (j * (j + 1) <= N)
					count2++;
			}

			if (count1 > count2) {
				System.out.println("Aayush");
			} else {
				System.out.println("Harshit");
			}
		}

	}
}
