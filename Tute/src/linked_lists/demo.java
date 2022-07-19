package linked_lists;

// Reference - https://www.geeksforgeeks.org/linked-list-in-java/

public class demo {

	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		Node temp = head;
		int size = 0;
		while (temp != null) {
//			System.out.print(temp.data+" ");
			temp = temp.next;
			size++;
		}
		return size;

	}

	public int getfirst() {
		if(head == null) {
			throw new RuntimeException ("Your Linked list is empty , cannot retrive element ");
		}
		return head.data;
	}
	private Node getLastNode() {
		if (head == null) {
			throw new RuntimeException("LL is empty");
		}
		Node temp = head;
		while (temp.next != null) {
//			System.out.println(temp.data);
			temp = temp.next;
		}
		return temp;
	}

	public 	int getlast() {
		if(head == null) {
			throw new RuntimeException ("Your Linked list is empty , cannot retrive element ");
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	private Node getIdxNode(int idx) {
		if (idx<0||idx >= size()) {
			throw new RuntimeException("Indx out of bounds");
		}
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	
	public int getIdx(int idx) {
		if (idx<0||idx >= size()) {
			throw new RuntimeException("Index out of bounds");
		}
		Node temp = head;

		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	public void addLast(int ele) {
		Node nn = new Node(ele);
		if(head==null) {
			head = nn;
			return;
		}
		Node last = getLastNode();
		last.next = nn;
	}
	
	public void addFirst(int ele) {
		Node nn = new Node(ele);
		nn.next = head;
		head = nn;
	}
	

	public void add_at_idx(int idx, int ele){
		if(idx == 0) {
			addFirst(ele);
		}else if(idx == size()) {
				addLast(ele);
		}	 else if (idx > size()) {
			throw new RuntimeException("invalid idx");
		} else {
			Node nn = new Node(ele);
			Node prev = getIdxNode(idx - 1);

			Node curr = prev.next;// 30k!!
			prev.next = nn;
			nn.next = curr;
		}
	}
	
	public int removeFirst() {
		if(head==null) {
			throw new RuntimeException("LL EMpty");
		}
		Node temp = head;
		head = head.next;
		return temp.data;
	}
	
//	public int removeAt(int idx) {
//		if(idx==0) {
//			return removeFirst();
//		}
//		if(idx>=size()||idx<0) {
//			throw new RuntimeException("invalid idx");
//		}
//		Node prev = getIdxNode(idx-1);
//		Node curr = prev.next;
//		Node ahead = curr.next;
//		prev.next = ahead;
////		prev.next = prev.next.next;
//	}
}