package arrays;

public class sub_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++) {
				disp(arr,i,j);
			}
		}
	}

	public static void disp(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<=j) {
			System.out.print(arr[i]+ " ");
			i++;
		}
		System.out.println();
		
	}
	
	

}
