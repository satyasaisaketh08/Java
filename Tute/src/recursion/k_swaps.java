package recursion;

import java.util.*;

public class k_swaps {
	static long max = Long.MIN_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		Long k = sc.nextLong();
		char[] arr = n.toCharArray();
		max = Long.MIN_VALUE;
		k_swap(arr, k);
		System.out.println(max);
	}

	public static void k_swap(char[] arr, Long k) {

		String str = new String(arr);
		Long num = Long.parseLong(str);
		if (num > max) {
			max = num;
		}
		if (k == 0) {
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(arr, i, j);
				k_swap(arr, k - 1);
				swap(arr, i, j);
			}
		}
	}

	public static void swap(char[] arr, int i, int j) {

		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
