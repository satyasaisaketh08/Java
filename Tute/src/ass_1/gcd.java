package ass_1;

import java.util.*;
public class gcd {
    public static void main(String args[]) {
        Scanner input  =  new Scanner(System.in);

        int divisor = input.nextInt();
        int dividenend  = input.nextInt();

        while(divisor!=0){
            int remainder = dividenend%divisor;
            dividenend = divisor;
            divisor = remainder;
        }
        System.out.println(dividenend);
    }
}