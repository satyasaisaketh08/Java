package ass_2;

import java.util.*;

public class hollow_diamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int row = 1;
		int nst = rows / 2 + 1;
		int nsp = -1;
		while (row <= rows) {
			int cst1 = 1;
			while (cst1 <= nst) {
				System.out.print("* ");
				cst1++;
			}

			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst2 = 1;
			if (row == 1 || row == rows) {
				cst2 = 2;
			}
			while (cst2 <= nst) {
				System.out.print("* ");
				cst2++;
			}
			row++;
			System.out.println("");
			if (row <= rows / 2 + 1) {
				nst--;
				nsp += 2;
			}

			else {
				nst++;
				nsp -= 2;
			}

		}

	}
}