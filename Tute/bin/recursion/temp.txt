package reucrsion;
public class rat_in_maze
{
    public static void main(String[] args) {
    		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
    		rat_maze_2(0, 0, maze.length - 1, maze[0].length - 1, maze, "",new boolean[maze.length][maze[0].length]);
    	}
	
	public static void rat_maze(int r , int c, int dr , int dc , int [][] maze , String ans, boolean[][] Visited ){
	   if(r == dr && c == dc){
	       System.out.println(ans);
	        return;
	    }
	   
	    if(r == maze.length || c == maze[0].length || maze[r][c] == 1){
	        return;
	    }
	    Visited[r][c] = true;
	    rat_maze(r , c+1, dr, dc , maze , ans+"R", Visited);
	    rat_maze(r+1 , c, dr, dc , maze , ans+"D",Visited);
	}
	
	public static void rat_maze_2(int r, int c, int dest_r, int dest_c, int[][] maze, String path, boolean[][] Visited) {
//		
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}

		if (r < 0 || c < 0 || r == maze.length || c == maze[0].length || maze[r][c] == 1 || Visited[r][c]) {
			return;
		}
		Visited[r][c] = true;
		rat_maze_2(r - 1, c, dest_r, dest_c, maze, path + "U", Visited);
		rat_maze_2(r + 1, c, dest_r, dest_c, maze, path + "D", Visited);
		rat_maze_2(r, c + 1, dest_r, dest_c, maze, path + "R", Visited);
		rat_maze_2(r, c - 1, dest_r, dest_c, maze, path + "L", Visited);
		Visited[r][c] = false;
	}
}
