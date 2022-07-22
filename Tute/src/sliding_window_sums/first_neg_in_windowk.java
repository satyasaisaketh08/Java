package sliding_window_sums;
import java.util.*;
public class first_neg_in_windowk {
	
	public static void main(String[] args) {
		int k = 2;
		int[] arr = {-8,2,3,-6,10};
		int[] firstNegativeNumbers = solve(k,arr);
		for(int i=0;i<firstNegativeNumbers.length;i++) {
			System.out.print(firstNegativeNumbers[i] + " ");
		}
	}
	
	private static int[] solve(int k , int[] arr) {
		// TODO Auto-generated method stub
		
		int[] narr = new int[(arr.length) - k + 1];
		int idx = 0;
		
		Queue<Integer> Q = new LinkedList<>();
		
		int ws = 0;
		
		for(int we = 0;we<arr.length;we++) {
			if(arr[we] < 0) {
				Q.add(arr[we]);
			}
			if(we-ws+1 == k) {
				if(Q.isEmpty()) {
					narr[idx++] = 0;
				}else {
					int num = Q.peek();
					narr[idx++] = num;
					
					if(num == arr[ws]) {
						Q.remove();
					}
				}
				ws++;
			}
			
		}
		
		return narr;

		
		

	}

}