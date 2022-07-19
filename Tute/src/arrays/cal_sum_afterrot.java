import java.util.*;
public class cal_sum_afterrot{
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		} 
		
		int tc = sc.nextInt();
		for (int i=0;i<tc;i++){
		    int rot = sc.nextInt();
		    cal_sum(arr,rot);
		}
		int sum = 0;
		
		for (int i=0;i<arr.length;i++){
	        sum = sum + arr[i];
	    } 
	    int ans = sum % (int)Math.pow(10,16);
	    System.out.println(ans);
	}
	
	public static void cal_sum(int[] arr, int rot){
	    int[] nn_arr = new int[arr.length];
	    int sum = 0;
	    for(int i=0; i<arr.length; i++){
	        nn_arr[i] = arr[i];
	    }
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
	    for(int i=0; i<arr.length;i++){
	        arr[i] = arr[i] + nn_arr[i];
	    }
	}

} 