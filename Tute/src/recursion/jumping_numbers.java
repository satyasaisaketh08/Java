package recursion;

import java.util.Arrays;
import java.util.List;

public class jumping_numbers {
	public static void main(String[] args) {
		for (int i=1;i<=9;i++){
		    jumping_num(i,105);
		    System.out.println("---------------");
		} 
		
		
	}
	
	public static void jumping_num(int n,int limit){
	    if(n>limit){
	        return;
	    }
	    System.out.println(n);
	    int i=0;
	    if(n==0){
	        i=1;
	    }
	    int digit = n%10;
	    jumping_num(n*10+digit-1,limit);
	    jumping_num(n*10+digit+1,limit);
	}

}
