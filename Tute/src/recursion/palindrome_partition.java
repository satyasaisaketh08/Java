package recursion;
import java.util.*;
public class palindrome_partition {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    for (int i=0;i<tc;i++){
	        String s = sc.next();
	        List<List<String>> AAL = new ArrayList<List<String>>();
	        ArrayList<String> AL  = new ArrayList<>();
		    System.out.println("\n"+pal_part(s," ",AL,0));
	    } 
	    
	}
	
	private static String pal_part(String s, String string, ArrayList<String> aL, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public static int pal_part(String s , String parts , ArrayList<>AL,int count){
	    if(s.isEmpty()){
	       // System.out.print(AL);
	        count++;
	        return count;
	        AAL.add(new ArrayList<String>(AL));
	    }
	    for (int len=1;len<=s.length();len++){
	        String chopped = s.substring(0,len);
	        if(pal(chopped)){
    	        String remained  = s.substring(len);
    	        AL.add(chopped);
    	        count  = pal_part(remained,parts+" "+chopped,AL,count);
    	        AL.remove(AL.size()-1);
	        }
	    } 
	    return count;
	}
	
	public static boolean pal(String s1){
	    int s = 0;
	    int e = s1.length()-1;
	    while(s<=e){
	        if(s1.charAt(s) != s1.charAt(e)){
	            return false;
	        }
	        s++;
	        e--;
	    }
	    return true;
	}

}
