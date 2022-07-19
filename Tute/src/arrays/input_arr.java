package arrays;

import java.util.*;

public class input_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i :arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
