package recursion;

public class place_queens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		place_q(0,2,4,"");

	}
	
	public static void place_q(int x, int qtp , int tot_col , String ans) {
			if(qtp == 0) {
				System.out.println(ans);
				return;
			}
			
			if(x == tot_col){
				return;
			}
			
			place_q(x+1,qtp-1,tot_col,ans+"Q"+x);
			place_q(x+1,qtp,tot_col,ans);
			
	}

}
