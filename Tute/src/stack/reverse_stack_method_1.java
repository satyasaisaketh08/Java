package stack;
import java.util.*;
public class reverse_stack_method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		for(int i=0;i<5;i++) {
			s1.push(i);
		}
		
		System.out.println("The original stack is:"+s1);
		
		for(int i=0;i<5;i++) {
			Integer ele = s1.pop();
			s2.push(ele);
		}
		
		System.out.println("The reversed stack is:"+s2);

	}

}
