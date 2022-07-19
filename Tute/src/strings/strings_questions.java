package strings;

import java.util.*;
public class strings_questions 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
// 		System.out.println(check_palindrome(s));
        System.out.println(check_palindrome_with_stringbuilder(s));
		
	}
	
	public static boolean check_palindrome(String s){
	     String rev = "";
	     
	     for (int i= s.length() - 1;i>=0; i--){
	         rev = rev + s.charAt(i);
	     } 
	     
	     if(s.equals(rev)){
	         return true;
	     }
	     
	     
	     return false;
	}
	
	public static boolean check_palindrome_with_stringbuilder(String s){
	     StringBuilder sb = new StringBuilder(s);
	     
	     String rev = sb.reverse().toString();
	     
	     if(s.equals(rev)){
	         return true;
	     }
	     
	     return false;
	     
	}
}
