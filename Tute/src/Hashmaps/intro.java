package Hashmaps;

import java.util.HashSet;

public class intro {
	
//	Hashset , Hashmap 
	
//	This is a part of the collection framework 

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		
		if(s.contains(2)) {
			System.out.println("Present");
		}
		
		s.remove(2);
		
		System.out.println(s);
	}

}
