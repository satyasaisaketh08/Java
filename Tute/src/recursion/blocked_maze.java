package recursion;

public class blocked_maze {
	
	public static void main(String[] args) {
		int[][] maze = {};
	}
	
	public static void solve(int[][] maze , int r , int c , String ans,boolean[][] visited){
	    if(r<0|| r==maze.length||c<0||c==maze[0].length||maze[r][c]==0){
		    return;
		}if(r==maze.length-1||c==maze[0].length-1){
		    System.out.println(ans);
		}
	    visited[r][c] = true;
	    solve(maze , r+1,c,ans+"D",visited);
	    solve(maze , r-1,c,ans+"U",visited);
	    solve(maze , r,c+1,ans+"R",visited);
	    solve(maze , r,c-1,ans+"L",visited);
	    visited[r][c] = false;
	}

}
