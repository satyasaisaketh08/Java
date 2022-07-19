package patterns;

public class extrapat {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				// as we need columsn we use j 
				// if we need row wise output we use i in place of j 
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
