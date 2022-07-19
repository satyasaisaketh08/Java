package tute;

public class bin2dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  = 1001011;
		int pow = 1;
		int ans = 0;
		while(n > 0) {
			int digit  = n %10;
			n = n/10;
			ans += digit*Math.pow(2, pow);
			pow = pow++;
		}
		System.out.println(ans);

	}

}
