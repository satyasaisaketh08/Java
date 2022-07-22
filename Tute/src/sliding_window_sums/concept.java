package sliding_window_sums;

public class concept {
	
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400};
		int k = 2;
		solve(arr,k);
	}

	private static void solve(int[] arr, int k) {
		// TODO Auto-generated method stub
		int sum = 0;
		int max_sum = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
			if(sum > max_sum) {
				max_sum = sum;
			}
		}
		
	}

}
