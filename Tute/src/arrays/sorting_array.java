package arrays;
/*
 * We can use sorting algorithms to optimize the sum
 * We can use arrays.sort - but time complexity more
 * We can manually sort using for loops - asc , desc 
 * */

public class sorting_array {

	public static void main(String[] args) {
		int [] arr = new int[]{1,5,7,6,3,2,4}; 
		// ascending method of sorting 
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					// for asc use - arr[i] > arr[j]
					// for desc use - arr[i] < arr[j]
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int a: arr) {
			System.out.println(a);
		}
	}

}
