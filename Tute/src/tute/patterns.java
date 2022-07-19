package tute;

public class patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		int row = 1;
		int nst = 1;
		
		while(row<=n) {
			int cst = 1;
			while(cst<=nst) {
				System.out.println("* ");
				cst++;
			}
			row++;
			System.out.println();
			nst++;
		}
		
		

	}

}
