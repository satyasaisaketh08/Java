package tute;

public class armstrongnum
{
	public static void main(String[] args) {
	    int n = 135;
	    if (isArmstrong(n)){
	        System.out.println("true");
	    }else{
	        System.out.println("false");
	    } 
	}
	
	public static boolean isArmstrong(int n) {
		if(armstrong_check(n) == n) {
			return true;
		}
		return false;
	}

	static int nod(int num) {
	    int nood = 0;
	    while(num != 0){
	        int digit = num%10;
	        nood ++;
	        num = num/10;
	    }
        return nood;
	}
	
	static int armstrong_check(int num){
	    int ans = 0;
	    while(num != 0){
	        int digit = num%10;
	        ans = ans + (int) Math.pow(digit, nod(num));
	        num = num/10;
	    }
	    return ans;
	}
}

