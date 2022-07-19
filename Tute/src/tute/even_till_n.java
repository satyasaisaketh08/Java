package tute;
import java.util.*;
public class even_till_n{
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int max = sc.nextInt();
	   for(int i=1; i<=max; i++){
	       if(i%2 == 0){
	           System.out.println(i);
	       }
	   }
	}
}
