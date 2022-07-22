package sliding_window_sums;

public class maximum_sum_subarrk {
	
	public static void main(String[] args) {
		int[] arr = {100, 200, 300, 400};
		int k = 2;
		System.out.println(solve(arr,k));
	}
	
	public static int solve(int[] a , int k) {
		// TODO Auto-generated method stub
		if(a.length == 0 || k == 0) {
			return 0;
		}
			int maxSum = Integer.MIN_VALUE;
	        int windowStart = 0;
	        int windowSum = 0;
	        
	        for(int windowEnd = 0; windowEnd < a.length; windowEnd++) {
	            windowSum += a[windowEnd];
	            
//	            Sum of the previous window - (Element going out of the window) + (Element getting included in the window)
	            if(windowEnd-windowStart+1 == k) { // When we hit the window size. Update maximum sum, and slide the window
	                maxSum = Math.max(maxSum, windowSum);
	                windowSum -= a[windowStart]; // Subtract the element going out of the window
	                windowStart++; // Slide the window
	            }
	        }
		return maxSum;
	}

}
