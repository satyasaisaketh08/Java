package arrays;
import java.util.*;

public class array_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Wrapper classes - stored in heap
//		Array lists - dynamic allocation of size not like in array(fixed size)
		ArrayList <Integer> AL = new ArrayList<Integer>();
//		Initial size  - 
		System.out.println(AL.size());
//		Add at AL.size() index or at the end!!
		AL.add(10);
		AL.add(20);
		AL.add(30);
//		Add at a index
		AL.add(1,5);
//		Add at last 
		AL.add(AL.size() , 100);
//		print arraylist
		System.out.println(AL);
//		Getting info at index i , arr[i]
		System.out.println(AL.get(AL.size()-1));
//		Updating values at certain position
		AL.set(1,6);
		System.out.println(AL);
//		Removing value at certain index
		System.out.println(AL.remove(1));
		System.out.println(AL);
		
//		Enhanced loop to print
		for (int i : AL) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		
	}

}
