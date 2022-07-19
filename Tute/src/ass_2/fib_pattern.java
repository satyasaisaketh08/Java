package ass_2;

import java.util.*;
public class fib_pattern
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = 0;
		int present  = 1;
		int next = prev + present;
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=i; j++){
		        System.out.print(prev + "\t");
		        prev = present;
		        present = next;
		        next = prev + present;
		    }
		    System.out.println();
		}
	}
}
