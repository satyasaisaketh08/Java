package arrays;

import java.util.*;
public class squares_of_sorted_array
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		} 
		
		sqsort_ele(arr);
		for (int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    } 
        System.out.println();
	}
	
	public static void sqsort_ele(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] * arr[i];
             
        Arrays.sort(arr);
    }
}
