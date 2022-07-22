package Hashmaps;
import java.util.*;
public class count_distinct__ele {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3};
		solve(arr);
	}
	
	private static void solve(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> s = new HashSet<>();
		
		for(int ele :arr) {
			s.add(ele);
		}
		
		System.out.println(s.size());
	}

}
