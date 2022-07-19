package arrays;

public class rotation_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		rotation1(arr,3);
		disp(arr);
//		optimized method pen cap method 
		rotation2(arr,3);
	}

	public static void rotation1(int[] arr, int rot){
	    rot = rot%arr.length;
	    
	    if(rot < 0){
	        rot  = rot + arr.length;
	    }
	    for (int r = 1; r <= rot; r++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = last;

		}
	}
	
	public static void rev2(int[] arr, int s, int e) {
		int start = s;
		int end = e;
		while (start < end) {
//			swap!!
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
//			Update!!
			start++;
			end--;
		}
	}
	
	public static void rotation2(int[] arr, int rot) {

		rot = rot % arr.length;
		if (rot < 0)
			rot = rot + arr.length;
		
//		Step 1: Divide the array into 2 parts, body and a cap and then reverse them 
//		reverse Body!!
		rev2(arr,0,arr.length-1-rot);
//		reverse the cap
		rev2(arr,arr.length-rot,arr.length-1);
//		disp(arr);
		
//		Step 2: rotate whole array!!
		rev2(arr,0,arr.length-1);
//		disp(arr);
	}
	
	
	
	public static void disp(int[] arr) {
		for(int i : arr) {
			System.out.println(arr[i]);
		}
		
	}

}
