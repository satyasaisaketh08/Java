package tute;
import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringBuilder sb = new StringBuilder(a);
		String rev = (sb.reverse()).toString();
		if(a.equals(rev)){
		    System.out.println("Palindrome");
		}else{
		    System.out.println("Not a palindrome");
		}
	}
}
