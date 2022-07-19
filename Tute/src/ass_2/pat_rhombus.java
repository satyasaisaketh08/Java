package ass_2;

import java.util.*;

public class pat_rhombus {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int n;
		n = scn.nextInt();
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int num_row = 1;
		while (row <= 2 * n - 1) {
			int num = num_row;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(num + "\t");
				cst++;
				if (cst <= nst / 2 + 1) {
					num++;
				} else {
					num--;
				}

			}
			row++;
			System.out.println();

			if (row <= n) {
				nst += 2;
				nsp--;
				num_row++;
			} else {
				nst -= 2;
				nsp++;
				num_row--;

			}

		}

	}
}
