package linked_lists;

import java.util.Stack;

// Reference - https://www.geeksforgeeks.org/linked-list-in-java/

public class linkedlist {

	class Node {
		public Node(int element) {
			data = element;
		}

		int data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + "|");
			temp = temp.next;
		}
	}

	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
			count++;
		}
		return count;
	}

	public int getfirst() {
		if (head == null) {
			throw new RuntimeException("LL contains only one node");
		}
		return head.data;
	}

	public Node getfirstnode() {
		return head;
	}

	public int getlast() {
		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		return temp.data;
	}

	public Node getlastnode() {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp;
	}

	public int getat(int idx) {
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getidxnode(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("Indx out of bounds");
		}
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addlast(int element) {
		Node toadd = new Node(element);
		if (head == null) {
			head = toadd;
			return;
		} else {
			Node last = getlastnode();
			last.next = toadd;
		}

	}

	public void addfirst(int element) {
		Node toadd = new Node(element);
		Node first = getfirstnode();
		first.next = toadd;
		head = toadd;
	}

	public void addat(int idx, int element) {
		if (idx == 0) {
			addfirst(element);
		} else if (idx == size()) {
			addlast(element);
		} else if (idx > size()) {
			throw new RuntimeException("invalid index");
		} else {
			Node nn = new Node(element);
			Node prev = getidxnode(idx - 1);

			Node curr = prev.next;
			prev.next = nn;
			nn.next = curr;
		}

	}

	public int removefirst() {
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public int removeat(int idx) {
		if (idx >= size() || idx == 0) {
			throw new RuntimeException("invalid index");
		}
		Node prev = getidxnode(idx - 1);
		Node curr = prev.next;
		Node ahead = curr.next;
		prev.next = ahead;
//		 prev.next = prev.next.next;
		return curr.data;
	}

	public void reverse_ll() {
		Node prev = null;
		Node curr = head;

		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;
		}
		head = prev;
	}

	public void reverse_print_ll_recur(Node temp) {
		if (temp == null) {
			return;
		}

		reverse_print_ll_recur(temp.next);
		System.out.print(temp.data + "| ");
	}

	public Node reverse_ll_recur(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node newhead = reverse_ll_recur(head.next);
		head.next.next = head;
		head.next = null;

		return newhead;
	}

	public int midele() {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int kthdistlast(int k) {
		Node ahead = head;
		while (k > 0) {
			ahead = ahead.next;
			k--;
		}

		Node beyond = head;
		while (ahead != null) {
			ahead = ahead.next;
			beyond = beyond.next;
		}
		return beyond.data;
	}

	public void kth_reverse(int k) {
		Node temp = head;
		Stack<Node> S = new Stack<>();
		Node lastnode = null;
		Node firstnode = null;
		while (temp != null) {
			Node ahead = temp.next;
			if (S.size() == k) {
				while (!S.isEmpty()) {
					Node nn = S.pop();
					if (lastnode == null) {
						lastnode = nn;
					} else {
						lastnode.next = nn;
						lastnode = nn;
					}
				}
			}
			S.add(temp);
			temp = ahead; // Sometimes it is dangeorus
		}
		
		while(!S.isEmpty()) {
			Node nn = S.pop();
//			add this node at the ending of a new Linked LIst
			if(lastnode==null) {
				lastnode=nn;
			}else {
				lastnode.next = nn;
				lastnode = nn;
			}
		}
		lastnode.next = null;
		head = firstnode;
	}

}