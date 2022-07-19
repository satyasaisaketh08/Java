package patterns;
import java.util.*;
public class pat_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<=n; i++) {
			for(int j =0; j<=n-i + 1; j++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
