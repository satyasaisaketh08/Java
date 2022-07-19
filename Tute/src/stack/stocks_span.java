package stack;
import java.util.*;
public class stocks_span {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		solve(arr);
		System.out.print("END");
	}

	public static void solve(int[] arr) {
		// TODO Auto-generated method stub
		int[] sa = new int[arr.length];
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		
		sa[0] = 1;
		
		for(int i=1;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
				s.pop();
			}if(s.isEmpty()) {
				sa[i] = i+1;
			}else {
				sa[i] = i-s.peek();
			}
			s.push(i);
		}
		for(int ans:sa) {
			System.out.print(ans + " ");
		}
		
	}
}
		

