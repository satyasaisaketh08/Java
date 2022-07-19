package arrays;
import java.util.*;
public class pair_of_roses
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0; i<tc; i++){
            int[] rose_price = new int[sc.nextInt()];
            
            for(int j=0; j<rose_price.length;j++){
                rose_price[j] = sc.nextInt();
            }
            
            int money = sc.nextInt();
            Arrays.sort(rose_price);
            pair_roses(rose_price,money);
        }
	}
	
	public static void pair_roses(int[] rose_price ,int money) {
	    int first = 0;
	    int second = Integer.MAX_VALUE;
	    for(int a=0; a<rose_price.length-1; a++){
	        for(int b=a+1; b<rose_price.length; b++){
	            if(rose_price[a] +  rose_price[b] == money && (rose_price[b] - rose_price[a]) < (second-first)){
	                first = rose_price[a];
	                second = rose_price[b];
	            }
	        }
	    }
	    System.out.println("Deepak should buy roses whose prices are" + first +"and"+ second +".");
	}
}
