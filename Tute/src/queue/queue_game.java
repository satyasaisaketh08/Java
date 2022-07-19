package queue;
import java.util.*;
public class queue_game {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int k = 0;k<tc;k++) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i = 0;i<size;i++) {
				arr[i] = sc.nextInt();
			}
			if(solve(arr)) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}
	}
	
	public static boolean solve(int[] arr) {
		int ones_count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				ones_count++;
			}else {
				ones_count--;
			}
			if(ones_count < 0) {
				return false;
			}
		}
		
		
		return true;
	}
}
