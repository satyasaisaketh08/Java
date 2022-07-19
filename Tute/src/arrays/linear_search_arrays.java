package arrays;
import java.util.*;
public class linear_search_arrays
{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++){
		    arr[i] = sc.nextInt();
		}
		
		int search = sc.nextInt();

		for (int i=0;i<arr.length;i++ ){
		    if(arr[i] == search){
		       System.out.println("element is found at :" +i);
		    }else {
		    	System.out.println("-1");
		    }
		}
	}
}
