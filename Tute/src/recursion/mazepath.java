package recursion;
import java.util.*;
public class mazepath {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
		System.out.println(mazepath(0,0,"",n1,n2,0));
	}
	
	public static int mazepath(int row, int col , String path , int d_row, int d_col, int count){
	    if(row == d_row-1 && col == d_col-1){
	        System.out.println(path);
	        count++;
	        return count;
	    }if(row == d_row || col == d_col){
	        return count;
	    }
	    count = mazepath(row,col+1,path+"V",d_row,d_col,count);
	    count = mazepath(row+1,col,path+"H",d_row,d_col,count);
	    count = mazepath(row+1,col+1,path+"D",d_row,d_col,count);
	    return count;
	}

}
