package arrays;
import java.util.*;
public class array_lists_queations
{
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,1,2,4};
		
// 		System.out.println(intersection_arrays(arr1 , arr2));
        System.out.println(adding_arrays(arr1 , arr2));
		
		
 		
	}
	
	public static ArrayList<Integer> intersection_arrays(int[] arr1 , int[] arr2){
	    ArrayList<Integer> AL = new ArrayList<Integer>();
	    for (int i=0;i<arr1.length;i++a){
	        for (int j=0;j<arr2.length;j++){
	            if(arr1[i] == arr2[j]){
	                AL.add(arr1[i]);
	            }
	        } 
	    }
	    return AL;
	}
	
	
	public static ArrayList<Integer> adding_arrays(int[] arr1, int[] arr2){
	    ArrayList<Integer> AL = new ArrayList<Integer>();
	    int A = arr1.length - 1;
	    int B  = arr2.length - 1;
	    
	    int carry = 0;
	    
	    while(A>=0 && B >=0){
	        for (int i=0;i<arr1.length;i++){
	            for (int j=0;j<arr2.length;j++){
	                int sum = arr1[i] + arr2[j] + carry;
	                carry = sum/10;
	                AL.add(sum%10);
	            } 
	        } 
	        A--;
	        B--;
	    }
	    return AL;
	}
}
