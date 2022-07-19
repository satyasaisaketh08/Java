package arrays;

public class max_min_num_inarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,12,25,45,67};
		int max = arr[0];
		int min = arr[0];
		
//		We can use Integer methods also like 
//		max = INTEGER_MAX;
//		min = INTEGER_MIN
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The max number is:" + max);
		System.out.println("The min number is:" + min);

	}

}
