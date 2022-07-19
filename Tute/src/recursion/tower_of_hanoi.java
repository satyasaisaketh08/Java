package recursion;
import java.util.*;
public class tower_of_hanoi
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		tower_hanoi(n,'A','C','B');
	}
	
	public static void tower_hanoi(int n , char start , char helper , char dest){
	    if(n==0){
	        return;
	    }
	    tower_hanoi(n-1,start,helper,dest);
	    System.out.println("Moving ring"+" " + n +" "+"from"+" "+ start +" "+"to"+ dest);
	    tower_hanoi(n-1,helper,dest,start);
	}
}
