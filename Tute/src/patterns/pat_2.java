package patterns;

public class pat_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int row = 1; row<=n; row++) {
			for(int col=1; col<=row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
