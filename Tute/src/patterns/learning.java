package patterns;
import java.util.*;

public class learning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int row = 1;
		int nst = n;
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
			
		}
		
	}

}
