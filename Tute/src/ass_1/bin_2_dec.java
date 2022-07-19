package ass_1;

import java.util.*;
class bin_2_dec {
    static int conversion(int n) {
        Scanner sc = new Scanner(System.in);
        // int tc = sc.nextInt();
        int base = 1;
        int decimal = 0;
        int num = n;
        int temp = num;
        while(temp>0){
            int digit = temp%10;
            temp = temp/10;
            decimal += digit*base;
            base = base*2;
        }
        return decimal;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            int num = sc.nextInt();
            System.out.println(conversion(num));
        }
    }
}
