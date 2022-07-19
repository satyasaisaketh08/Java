package ass_2;
import java.util.*;

public class pattern_magic {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int row = 1;
        int nst = rows;
        int nsp = -1;
        while(row <= (2*rows-1)){
            int cst1 = 1;
            while(cst1 <= nst){
                System.out.print("*");
                cst1++;
            }

            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }

            int cst2 = 1;
            if(row == 1 || row == (2*rows-1)){
                cst2 = 2; 
            }
            while(cst2 <= nst){
                System.out.print("*");
                cst2++;
            }
            row++;
            System.out.println("");
            if(row > rows){
                nst++;
                nsp -= 2;
            }

            else{
                nst--;
                nsp += 2;
            }

        }
	    
	}
}