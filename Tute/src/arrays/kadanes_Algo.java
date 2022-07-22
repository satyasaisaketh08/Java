package arrays;

public class kadanes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2,1,-3,4,-1,2,1,-5,4 };
		System.out.println(maxSum(arr));
	}

	public static int maxSum(int[] arr) {
		int sum = 0;
		int maxsum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if(sum > maxsum) {
				maxsum = sum;
			}
//			System.out.println();
		}
		return maxsum;
	}

}
