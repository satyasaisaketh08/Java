package stack;

import java.util.*;

public class next_greatest_ele {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5 };
		Nxtgr8(arr);
	}

	public static void Nxtgr8(int[] arr) {
		Stack<Integer> S = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int var = arr[i];
//			looking for all the number which have a nextgreater
//			as var;

			while (!S.isEmpty() && S.peek() < var) {
//				var is the next greater of temp!!
				System.out.println(S.pop() + "=>" + var);
			}

			S.add(var);
		}
		while (!S.isEmpty()) {
			System.out.println(S.pop() + "=>" + -1);
		}
	}
	
	public static void Nxtgr8_2(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> S = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int var = arr[i];
//			looking for all the number which have a nextgreater
//			as var;

			while (!S.isEmpty() && arr[S.peek()] < var) {
//				var is the next greater of temp!!
				int idx = S.pop();
				System.out.println(arr[idx] + "=>" + var);
				ans[idx] = var;
			}

			S.add(i);
		}
		while (!S.isEmpty()) {
			int idx = S.pop();
			System.out.println(arr[idx] + "=>" + -1);
			ans[idx] = -1;
	
		}
		System.out.println(Arrays.toString(ans));
	}

}
