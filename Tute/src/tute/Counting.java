package tute;
import java.util.*;

// sum of numbers 
public class Counting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int limit = sc.nextInt();
		int n = 1;
		int sum = 0;
		while(n<=limit) {
			System.out.println(n);
			sum = sum+n;
			n++;
			// after the loop iterates all local var are deleted 
		}
		System.out.println(sum);
	}

}
