package tute;
import java.util.*;
public class table_program{
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int table = sc.nextInt();
	   for(int i=1; i<=10; i++){
	       System.out.println(table + "x" + i + "=" + (table*i) );
	   }
	}
}
