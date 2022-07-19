package recursion;

public class cointoss {
	
	public static void main(String[] args) {
		int n = 3;
		cointoss1(n," ");
	}	
	
	public static void cointoss1(int n ,String ans){
	    if(n==0){
	        System.out.println(ans);
	        return;
	    }
	    cointoss1(n-1,ans+"H");
	    cointoss1(n-1,ans+"T");
	}
	
	public static void Toss(int coins, String ans, boolean last_T) {
		if (coins == 0) {
//			if(ans.indexOf("TT")==-1)
			System.out.println(ans);
			return;
		}
//	Aim is toss a single coin1!

//		case 1:  when the coin is Head!!
		Toss(coins - 1, ans + "H", false);
//		case 2: when the coin is tails!!
		if (last_T == false) {
			Toss(coins - 1, ans + "T", true);
		}
	}

}
