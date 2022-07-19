package tute;
public class num_palindrome
{
	public static void main(String[] args) {
	    int n = 123;
		if(palindrome(n)){
		    System.out.println("Is a plaindrome");
		}else{
		    System.out.println("Not a palindrome");
		}
		
	}
	
	public static boolean palindrome(int a){
	    if(a == reverse(a)){
	        return true;
	    }else{
	        return false;
	    }
	}
	
	public static int reverse(int num){
	    int rev = 0;
	    while(num != 0){
	        int digit = num %10;
	        rev = rev*10 + digit;
	        num = num/10;
	    }
	    return rev;
	}
}
