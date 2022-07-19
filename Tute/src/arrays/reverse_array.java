package arrays;

import java.util.*;
public class reverse_array
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i=(arr.length)-1; i>=0 ;i--){
		    arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++){
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

