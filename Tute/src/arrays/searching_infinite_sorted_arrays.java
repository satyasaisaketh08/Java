package arrays;

public class searching_infinite_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
		int key = 4;
		System.out.println(search_infinite(a, key));
		

	}
	
	public static int search_infinite(int[] a , int key) {
		int low = 0;
		int high = 1;
		
		while(a[high] < key) {
			low = high;
			high = 2*high;
		}
		return binarysearch(a,key,low,high);
	}

	public static int binarysearch(int[] a, int key, int low, int high) {
		// TODO Auto-generated method stub
		int mid = (low + high) / 2;
		if(low > high) {
			return -1;
		}if(a[mid] == key) {
			return mid;
		}if(key > a[mid]) {
			return binarysearch(a,key,mid+1,high);
		}
		
		return binarysearch(a,key,low,mid-1);
		
		}

}
