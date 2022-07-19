package stack;

import java.util.Stack;

public class searching_naive_methid {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();

		for (int i = 0; i < 5; i++) {
			s1.push(i);
		}

		int ele = 5;

		if (s1.contains(ele)) {
			System.out.println(s1.indexOf(ele));
		}else {
			System.out.println("Element not found in the stack");
		}
	}

}
