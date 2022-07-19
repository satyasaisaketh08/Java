package recursion;
import java.util.*;
public class snakes_ladders_boardpath {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int M = sc.nextInt();
		System.out.println("\n"+board_path("",N,M,0));
	}
	
	public static int board_path(String path , int size, int faces , int count){
	    if(size == 0){
	        System.out.print(path + " ");
	        count++;
	        return count;
	    }if(size > 0){
	        for (int i=1;i<=faces;i++){
	            count  = board_path(path+i,size-i,faces,count);
    	    }
	}
	return count;
	}

}
