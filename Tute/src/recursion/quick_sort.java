package recursion;

import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
		int[] arr = {  10, 7, 8, 9, 1, 5 };
		quick(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int[] arr, int s, int e) {
		if (s > e) {
			return;
		}
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;
		while (L <= R) {
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L <= R) {
				
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		quick(arr, s, R);
		quick(arr, L, e);
	}

}
