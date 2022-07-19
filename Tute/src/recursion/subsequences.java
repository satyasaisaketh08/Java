package recursion;

public class subsequences {

	public static void main(String[] args) {
		SubSeq("abc", "");
		SubSeqASCII("abc", "");

	}
	
	public static void SubSeq(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
//		Including!!
		SubSeq(str.substring(1), ans + ch);

//		Excluding!!
		SubSeq(str.substring(1), ans);

	}
	public static void SubSeqASCII(String str, String ans) {
		if (str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
//		Including!!
		SubSeqASCII(str.substring(1), ans + ch);

//		Excluding!!
		SubSeqASCII(str.substring(1), ans);
		
//		ASCII !!
		SubSeqASCII(str.substring(1), ans+((int)ch));
		

	}

}
