package tute;
import java.util.*;
public class rotation {
// ^ - bitwise xor
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int rot = sc.nextInt();
		int nod = 0;
		int num = n;
		while(n > 0) {
			n = n/10;
			nod++;
		}
		for(int i=0; i<rot; i++) {
			
		}
		rot = rot % nod;
		while(rot>0) {
			int digit = num % 10;
			int part = num/10;
			num = (int) (digit*Math.pow(10, 5) + part);
			rot--;
		}
		System.out.println(num);
		
	
	}

}
