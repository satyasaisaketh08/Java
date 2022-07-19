package ass_1;

public class inverse_ofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int pos = 1;
		int ans = 0;
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			ans = ans + (int) (pos * Math.pow(10, digit));
			System.out.println(digit + " " + pos);
			pos++;
		}
		System.out.println(ans);

	}

}
