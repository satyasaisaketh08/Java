package ass_2;

import java.util.*;
public class mirror_star
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nsp = n/2;
	    int nst = 1;
	    for(int row=1; row<=n; row++){
	        for(int i=1; i<=nsp; i++){
	            System.out.print("  ");
	        }
	        for (int i = 1;i<=nst ;i++ ){
	            System.out.print("* ");
	        } 
	        if(row<n/2+1){
	            nsp--;
	            nst+=2;
	        }else{
	            nsp++;
	            nst-=2;
	        }
	        System.out.println();
	    }
	}
}





