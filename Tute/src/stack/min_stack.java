package stack;
import java.util.*;
public class min_stack {
	
	
//	Question - Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and an additional operation getMin() which should return minimum element from the SpecialStack. All these operations of SpecialStack must be O(1). To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, .. etc
	
	Stack <Integer> s ;
	Integer min;
	
	
	public min_stack() { 
		 s = new Stack<Integer>(); 
		 }
	
	void get_min() {
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
			}else{
				System.out.println("Min element is :" + min);
			}
		}
	
	void peek() {
		 if (s.isEmpty())
	        {
	            System.out.println("Stack is empty ");
	            return;
	        }
		 
		 Integer t = s.peek();
		 

		 System.out.println("Top Most Element is:");
		 
		 if (t < min) {
			 System.out.println(min);
		 }else {
			 System.out.println(t);
		 }
	}
	
	void pop() {
		if (s.isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
		System.out.print("Top Most Element Removed: ");
		Integer t = s.pop();
		
		 if (t < min)
	        {
	            System.out.println(min);
	            min = 2*min - t;
	        }else {
	        	System.out.println(t);
	        }
	}
	
	void push(Integer x) {
		if (s.isEmpty())
        {
            min = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }if (x < min)
        {
            s.push(2*x - min);
            min = x;
        }else
            s.push(x);
        
        System.out.println("Number Inserted: " + x);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		min_stack s = new min_stack();
        s.push(3);
        s.push(5);
        s.get_min();
        s.push(2);
        s.push(1);
        s.get_min();
        s.pop();
        s.get_min();
        s.pop();
        s.peek();
	}


}
