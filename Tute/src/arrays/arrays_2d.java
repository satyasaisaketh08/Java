package arrays;

import java.util.*;
public class arrays_2d
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
// 		System.out.println("Column wise");
		// wavepattern_col(arr);
// 		System.out.println("Row wise");
// 		wavepattern_row(arr);
        // spiral_anticlockwise(arr, rows , cols);
        // System.out.println("--------------");
        spiral_clockwise(arr, rows , cols);
	}
	
	public static void cols_as_rows(int[][] arr){
	    int r = arr.length;
	    int c = arr[0].length;
	    
	    for (int i=0;i<r;i++){
	        for (int j=0;j<c ;j++ ){
	            System.out.print(arr[j][i]);
	           // c++;
	           // r++;
	        }
	        System.out.println();
	    } 
	    
	}
	
	public static void wavepattern_row(int[][] arr){
	    int r = arr.length;
	    int c = arr[0].length;
	    
	    for(int i =0; i<r; i++){
	        if(i % 2 == 0 || i == 0){
	            for (int j=0;j<c;j++){
	                System.out.print(arr[i][j]+", ");
	            } 
	        }
	        
	        else{
	            for (int j=c-1;j>=0;j--){
	                System.out.print(arr[i][j]+ ", ");
	            }
	        }
	    }
	     System.out.println("END");
	}
	
	public static void wavepattern_col(int[][] arr){
	    int r = arr.length;
	    int c = arr[0].length;
	    
	    for (int i=0;i<c;i++){
	        if(i % 2 == 0 || i == 0){
	            for (int j=0;j<arr.length;j++){
	                System.out.print(arr[j][i] + ", ");
	            } 
	        }
	        else{
	            for (int j= r-1;j>=0;j--){
	                System.out.print(arr[j][i]+ ", ");
	            } 
	        }
	    }
	    System.out.print("END");
	}
	
	public static void spiral_anticlockwise(int[][] arr, int rows , int cols){
	    
	   // rows = arr.length;
	   // cols = arr[0].length;
	   
	   int rs = 0;
	   int re = arr.length - 1;
	   int cs = 0;
	   int ce = arr[0].length - 1;
	   
	   while(rs <= re && cs <= ce){
	       
	       // 1st round 
	       for (int r = rs;r<=re;r++){
	           System.out.println(arr[r][cs]);
	       }
	       //2nd round 
	       for (int c = cs+1;c<=ce;c++){
	           System.out.println(arr[re][c]);
	       }
	       //3rd round
	       for (int r = re-1;r>=rs;r--){
	           System.out.println(arr[r][ce]);
	       }
	       //4th round
	       for (int c = ce-1;c>=cs+1;c--){
	           System.out.println(arr[rs][c]);
	       }
	       rs++;
	       cs++;
	       re--;
	       ce--;
	   }
	}
	
	public static void spiral_clockwise(int[][] arr, int rows , int cols){
	    
	   // rows = arr.length;
	   // cols = arr[0].length;
	   
	   int rs = 0;
	   int re = arr.length - 1;
	   int cs = 0;
	   int ce = arr[0].length - 1;
	   int count=0;
	   int limit = arr.length*arr[0].length;
	   
	   while(rs <= re && cs <= ce){
	       
	       // 1st round 
	       for (int r = cs;r<=ce && count<=limit ;r++){
	           System.out.println(arr[rs][r]);
	           count++;
	       }
	       
	       rs++;
	       //2nd round 
	       for (int c = rs;c<=re && count<=limit ;c++){
	           System.out.println(arr[c][ce]);
	           count++;
	       }
	       ce--;
	       //3rd round
	       for (int r = ce;r>=cs&& count<=limit ;r--){
	           System.out.println(arr[re][r]);
	           count++;
	       }
	       re--;
	       //4th round
	       for (int c = re;c>=rs&& count<=limit ;c--){
	           System.out.println(arr[c][cs]);
	           count++;
	       }
	       cs++;
	   }
	}
}
