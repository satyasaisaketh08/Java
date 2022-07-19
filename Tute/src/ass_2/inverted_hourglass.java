package ass_2;


import java.util.*;
public class inverted_hourglass
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int row=1;
	    int nsp=2*n-1;
	    int number=n;
	    
	    while(row<=2*n+1){
	        
	        for(int i=n;i>=number;i--){
	            System.out.print(i+" ");
	        }
	        
	        for(int i=1;i<=nsp;i++){
	            System.out.print(" "+" ");
	        }
	        
	        for(int i=number;i<=n;i++){
	            if(i!=0)
	                System.out.print(i+" ");
	        }
	        
	        if(row<n+1){
	            nsp-=2;
	            number--;
	        }else{
	            nsp+=2;
	            number++;
	        }
	        
	        row++;
	        System.out.println();
	    }
	    
	    
	}
}