package stack;

import java.util.Stack;

public class reverse_stack_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s1 = new Stack<Integer>();

		for (int i = 0; i < 5; i++) {
			s1.push(i);
		}

		disprev(s1);

	}

	public static void disprev(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int ali = s.pop();
		disprev(s);
		s.push(ali);
		System.out.println(ali);
	}

	public static void disp(Stack<Integer> s) {
		System.out.println(s);
	}

}
