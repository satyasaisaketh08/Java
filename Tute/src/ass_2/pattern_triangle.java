package ass_2;

import java.util.*;
public class pattern_triangle
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int number=1;
		int nsp=n-1;;
		
		while(row<=n){
		    
		    for(int i=1;i<=nsp;i++){
		        System.out.print(" "+" ");
		    }
		    
		    for(int i=1;i<=2*row-1;i++){
		        if(i<row){
		            System.out.print(number+" ");
		            number++;
		        }else if(i>=row && i!=2*row-1){
		            System.out.print(number+" ");
		            number--;
		        }else{
		            System.out.print(number+" ");
		            number++;
		        }
		    }
		    
		    row++;
		    nsp--;
		    System.out.println();
		}
		
	}
}
