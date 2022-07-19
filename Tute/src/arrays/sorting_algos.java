package arrays;

import java.util.Arrays;

public class sorting_algos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 40, 30, 20, 10 };
		bubble(arr);
		selection(arr);
		int[] arr2 = {10,20,30,40,25};
		selection(arr2);
		insertion(arr);
	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i + 1] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
//			just to check all the possible swaps 
//			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}

//	Selection sort always minimizes the swaps 
	public static void selection(int[] arr) {
		int last = arr.length - 1;
		while (last > 0) {
			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max_idx]) {
					max_idx = i;
				}
			}
			int temp = arr[max_idx];
			arr[max_idx] = arr[last];
			arr[last] = temp;

			last--;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void insertion(int[] arr) {
	    for (int i=1;i<arr.length;i++){
	        int value = arr[i];
	        int hole = i-1;
	        
	        while(hole >= 0 && value < arr[hole]){
	            arr[hole + 1] = arr[hole];
	            hole--;
	        }
	        arr[hole+1] = value;
	    }
	    for (int i : arr ){
	        System.out.println(i);
	    }
	}

}
