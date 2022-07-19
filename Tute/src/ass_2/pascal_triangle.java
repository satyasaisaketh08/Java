package ass_2;
import java.util.*;
public class pascal_triangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n;
		n = scn.nextInt();
		int row = 0;
		while (row < n) {
			int cst = 0;
			int num = 1;
			while (cst <= row) {
				System.out.print(num + "      ");
				num = num * (row - cst) / (cst + 1);
				cst++;
			}
			row++;
			System.out.println();
		}
	}
}
