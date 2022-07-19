package arrays;

public class optimized_sorting_algos
{
	public static void main(String[] args) {
		int[] arr = {1,4,5,2,3};
		
//		bubble(arr);
//		selection(arr);
		insertion(arr);
	}
	
	public static void bubble(int[] arr) {
	    for(int count =0; count<arr.length-1;count++){
	        boolean swapped = false;
	        for (int i=0;i<arr.length-count-1;i++){
	            if(arr[i] > arr[i+1]){
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	                swapped = true;
	            }
	        }
	        if(swapped == false){
	            break;
	        }
	    }
	    
	    for (int i=0;i<arr.length;i++){
	        System.out.print(arr[i] + " ");
	    } 
	}
	
	
//	Mimum swaps algorithms 
	public static void selection(int[] arr) {
	    for (int i=0;i<arr.length-1;i++){
	        int imin = i;
	        for (int j=i+1;j<arr.length;j++){
	            if(arr[j] < arr[imin]){
	                imin = j;
	            }
	        }
	        int temp = arr[imin];
	        arr[imin] = arr[i];
	        arr[i] = temp;
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    } 
	    
	}
	
	public static void insertion(int[] arr) {
	    for (int i=1;i<arr.length;i++){
	        int value = arr[i];
	        int hole = i-1;
	        
	        while(hole >= 0 && value < arr[hole]){
	            arr[hole + 1] = arr[hole];
	            hole--;
	        }
	        arr[hole+1] = value;
	    }
	    for (int i : arr ){
	        System.out.println(i);
	    }
	}
}
