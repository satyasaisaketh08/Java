package recursion;
import java.util.*;
public class subsequences_sortedlexico {
	
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i=0;i<tc;i++){
            String s = sc.next();
            ArrayList<String> AAL = new ArrayList<String>();
            subsequences(s," ",AAL);
            for (String names:AAL){
                System.out.println(names);
            } 
        }
    }

		public static void subsequences(String s, String ans,ArrayList <String> AL){
	    if(s.isEmpty()){
	        AL.add(ans);
	        return;
	    }
	    char ch = s.charAt(0);
	    subsequences(s.substring(1),ans+ch,AL);
	    subsequences(s.substring(1),ans,AL);
	}

}
