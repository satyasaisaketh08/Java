package arrays;

public class best_time_buysell_stocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,2,6,1,4};
		System.out.println(solve(a));

	}
	
	public static int solve(int[] a) {
		int maxprofit = 0;
		int minsofar = a[0];
		
		for(int i=0;i<a.length;i++) {
			minsofar = Math.min(minsofar,a[i]);
			int profit = a[i] - minsofar;
			maxprofit = Math.max(maxprofit, profit);
		}
		return maxprofit;
	}

}
