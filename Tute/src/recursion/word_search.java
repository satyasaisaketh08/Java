package recursion;

import java.util.Iterator;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		
		System.out.println(present(board,word));
	}
	
	public static boolean present(char[][] board, String word) {
		ans = false;
		 for(int r=0;r<board.length;r++) {
			 for(int c = 0;c<board[0].length;c++) {
				 if(board[r][c] == word.charAt(0)) {
					 solve(board, r, c, word, new boolean[board.length][board[0].length]);
					 if(ans) {
						 return true;
					 }
				 }
			 }
		 }
		 return false;
	}
	boolean ans;
	public  void solve(char[][] board , int r , int c , String word , boolean[][] visited ) {
		if(word.isEmpty()) {
			ans = true;
			return;
		}
		
		if(r<0 || c<0 || r == board.length || c == board[0].length || board[r][c] != word.charAt(0) || visited[r][c]) {
			return;
		}
		visited[r][c] = true;
		solve(board, r, c+1, word.substring(1), visited);
		solve(board, r, c-1, word.substring(1), visited);
		solve(board, r+1, c, word.substring(1), visited);
		solve(board, r-1, c, word.substring(1), visited);
		visited[r][c] = false;
	}

}
