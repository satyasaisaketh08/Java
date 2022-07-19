package arrays;
import java.util.*;
public class minimum_swaps
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		} 
		
		min_swaps(arr);
	}
	
	public static void min_swaps(int[] arr) {
	    int count =0;
	    for (int i=0;i<arr.length-1;i++){
	        int imin = i;
	        for (int j= i+1;j<arr.length;j++){
	            if(arr[j] < arr[imin]){
	                imin = j;
	            }
	        }
	        if(imin != i){
	        int temp = arr[imin];
	        arr[imin] = arr[i];
	        arr[i] = temp;
	        count ++;
	        }
	    }
	    System.out.println(count);
	}

}

