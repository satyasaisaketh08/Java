package arrays;

import java.util.*;
public class searching_arrays_2d
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] arr = new int[rows][cols];
		
		for (int i=0;i<rows;i++){
		    for (int j=0;j<cols;j++){
		        arr[i][j] = sc.nextInt();
		    } 
		}
		int target = sc.nextInt();
	    if(twod_binary_search(arr, rows,cols,  target)){
	        System.out.println(1);
	    }else{
	        System.out.println(0);
	    }
	}
	
	public static boolean twod_linear_search(int[][] arr, int rows , int cols, int target) {
	    for (int i=0;i<arr.length;i++){
		    for (int j=0;j<arr.length;j++){
		        if(arr[i][j] == target){
		            return true;
		        }
		    } 
		}
	    
	    return false;
	}
	
	public static boolean twod_binary_search(int[][] arr, int rows , int cols, int ali) {
	    int row = 0;
	    int col = arr[0].length - 1;
	    while (row<arr.length && col>=0) {
			if (arr[row][col] == ali) {
				return true;
			} else if (arr[row][col] < ali) {
				row++;
			} else {
				col--;

			}
			
		}
		return false;
	}
}

