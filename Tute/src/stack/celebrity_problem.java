package stack;
import java.util.*;
public class celebrity_problem {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    int c = r;
	    int[][] arr = new int[r][c];
	    for (int i=0;i<r;i++){
	        for (int j=0;j<c;j++){
	            arr[i][j] = sc.nextInt();
	        } 
	    } 
	    solve(r,c,arr);
	}
	
	public static void solve(int r , int c, int[][] arr){
	 int p = -1;
	 for(int i=0;i<r;i++){
	     boolean isCelebrity = true;
	     for(int j=0;j<c;j++){
	         if( i!= j){
	             if(arr[i][j] == 1 || arr[j][i] == 0){
	                 isCelebrity = false;
	             }
	         }
	     }
	     if(isCelebrity == true){
            p = i;
            break;
        }
	 }
	 if(p != -1){
	     System.out.println(p);
	 }else{
	     System.out.println("No Celebrity");
	 }
}

}
