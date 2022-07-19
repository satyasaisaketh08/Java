package arrays;

import java.util.*;
public class binary_search
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int[] arr = new int[size];
//	    final long startTime = System.currentTimeMillis();
	    for (int i=0; i<size; i++ ){
	       arr[i] = sc.nextInt();
	    }
	    
	    Arrays.sort(arr);
	    int element  = sc.nextInt();
	    System.out.println(bin_search(arr, element));
//	    final long endTime = System.currentTimeMillis();
//	    System.out.println("Total execution time: " + (endTime - startTime));
	    
	}
	    
	    public static int bin_search(int[] arr, int element){
	        int start = 0;
	        int end = (arr.length)-1;
	        
	        while(start <= end){
	            int mid = (start + end)/2;
	            if (arr[mid] == element){
	                return mid;
	            }
	            else if(element < arr[mid]){
	                end = mid - 1;
	            }else{
	                start = mid + 1;
	            }
	        }
	         return -1;
	    }
}
