package tute;
public class factorial_recur
{
	public static void main(String[] args) {
		int n = 4;
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n){
	    if (n==0){
	        return 1;
	    }else{
	        return (n*factorial(n-1));
	    }
	}
}
