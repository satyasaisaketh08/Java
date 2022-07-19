package arrays;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 1;
		int[] arr2 = {1,2,3,4,5,6}; // literal method 
		char[] ch = {'a', 'b','c'};
		int[] arr = new int[5];
		System.out.println(arr.length);
		System.out.println(arr2.length);
		for(int i=0; i<(arr2.length); i++) {
			System.out.print(arr2[i] + ",");
		}
		System.out.println();
		
		for(int i=0; i<(ch.length); i++) {
			System.out.print(ch[i] + ",");
		}
		System.out.println();
		
//		enchanced for each loop  - read only 
		for(int i :  arr2) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

}
