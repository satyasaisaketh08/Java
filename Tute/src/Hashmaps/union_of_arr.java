package Hashmaps;
import java.util.*;
public class union_of_arr {
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,4,5};
		solve(a,b);
	}
	
	private static void solve(int[] a, int[] b) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> s = new HashSet<>();
		
		for(int x: a) {
			s.add(x);
		}
		
		for(int y : b) {
			s.add(y);
		}
		
		System.out.println(s.size());
		System.out.println(s);
		
	}

}
