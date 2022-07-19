package arrays;

import java.util.*;
public class running_total
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		running_sum(arr);
// 		for(int i=0; i<arr.length;i++){
// 	        System.out.println(arr[i]);
// 	    }
	}
	
	
	public static void running_sum(int[] arr){
	    for (int i=1;i<arr.length;i++){
	        arr[i] = arr[i] + arr[i-1];
	    }
	    
	    for(int i=0; i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
}

