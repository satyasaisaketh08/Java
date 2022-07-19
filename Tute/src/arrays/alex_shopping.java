package arrays;

import java.util.*;
public class alex_shopping
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		int[] arr = new int[items];
		
		for(int i = 0; i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		int tc = sc.nextInt();
		
		for (int i=0;i<tc;i++){
		    int A = sc.nextInt();
		    int k = sc.nextInt();
		    
		    if(alex(arr, A , k)){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
	
	public static boolean alex(int[] arr , int money , int items){
	   // arr - depicts the cost of itmes in shop
	   int count = 0;
	   for (int i=0;i<arr.length; i++){
	       
	       if(money % arr[i] == 0){
	           count ++;
	       }
	   }
	   if(count >= items){
	       return true;
	   }
	  return false; 
	}
}
