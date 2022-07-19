package recursion;
import java.util.*;
public class lexicographic_numbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> AAL = new ArrayList<Integer>();
		lexico(0,13,AAL);
		System.out.println(AAL);
		
		
	}
	
	public static void lexico(int start, int limit,ArrayList <Integer> AL){
	    if(start>limit){
	        return;
	    }
	    AL.add(start);
	    for (int i=1;i<=9;i++){
	           lexico(start*10+i,limit,AL);
	    } 
	}

}
