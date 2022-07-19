package arrays;

public class reverse_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
//		rev(arr);
		rev2(arr);
	}
	
//	Takes extra space for new array
	public static void rev(int[] arr) {
		int[] nn_arr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			nn_arr[i] = arr[arr.length - 1 - i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nn_arr[i];
			System.out.print(arr[i]);
		}
	}
	
//	Performing without extra space 
	public static void rev2(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		int n = arr.length;
		int start = 0;
		int end = n-1;
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
