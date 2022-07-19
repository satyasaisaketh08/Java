package strings;
import java.util.*;
public class pi_codility_test {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		System.out.println(solve(s,k));
	}
	
	public static String solve(String s , int k){
	    ArrayList<String> AL = new ArrayList<String>();
	    AL.add("Mon");
	    AL.add("Tue");
	    AL.add("Wed");
	    AL.add("Thu");
	    AL.add("Fri");
	    AL.add("Sat");
	    AL.add("Sun");
	    
	    int index = AL.indexOf(s);
	    return AL.get((index+k)%7);
	    
	}

}
