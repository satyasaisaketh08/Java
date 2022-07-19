package tute;

public class faren_to_celsius {
	public static void main(String[] args) {
		int min = 0;
		int max = 100;
		int step = 20;

		for (int F = min; F <= max; F = F + step) {
//			int C = (5*(F-32)/9);
			int C = (int) (5 / 9.0 * (F - 32));
			System.out.println(F + "\t" + C);
		}

		
	}
}
