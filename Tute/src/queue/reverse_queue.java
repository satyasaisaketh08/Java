package queue;
import java.util.*;
public class reverse_queue {
	
//	This can also be done using stacks and not only recyr
	
	public static void print_rev(Queue<Integer>Q, int c) {
		if(c==Q.size()) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		print_rev(Q,c+1);
		System.out.println(ali);
		
	}
	
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<Integer>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		Q.add(50);
//		System.out.println(Q);
		print_rev(Q, 0);
	}

}
