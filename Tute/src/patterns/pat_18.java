package patterns;

public class pat_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int nst =1;
		int nsp = n/2;
		while(row<=n){
			int csp = 1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			row++;
			System.out.println();
			if(row > n/2 +1) {
				nsp++;
				nst = nst-2;
			}else {
				nsp--;
				nst = nst+2;
			}
		}

	}

}
