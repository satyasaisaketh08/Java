package patterns;

public class pat_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int rows = 1; rows <= n; rows++) {
			for (int cols = 1; cols <= n; cols++) {
				if (rows == 1 || cols == 1 || rows == n || cols == n) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}

}
