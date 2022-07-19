package ass_2;

import java.util.*;
public class dec_2_octal {
    // dec2oct
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            long n = sc.nextInt();
            long mult = 1;
            long ans = 0;
            while(n > 0){
                long rem = n%8;
                ans = ans +rem*mult;
                mult = mult*10;
                n=n/8;
            }System.out.println(ans);
    }
}
