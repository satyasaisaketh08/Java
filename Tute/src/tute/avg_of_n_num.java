package tute;
import java.util.*;
public class avg_of_n_num{
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int nums = sc.nextInt();
	   int n = nums;
	   int sum = 0;
	   while(nums != 0){
	       int num = sc.nextInt();
	       sum +=num;
	       nums--;
	   }
	   int avg = sum/n;
	   System.out.println(avg);
	}
}
