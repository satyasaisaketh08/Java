package ass_2;
import java.util.*;
public class any_to_any {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long sb = sc.nextLong();
        long db = sc.nextLong();
        long sn = sc.nextLong();
        long mult = 1;
        long pow = 1;
        long ans = 0;
        long fnl = 0;
        while(sn>0){
            long rem = sn%10;
            ans = ans +rem*mult;
            mult = mult*sb;
            sn=sn/10;
        }

        while(ans > 0){
            long digit = ans%db;
            fnl = fnl + digit*pow;
            pow = pow*10;
            ans = ans/db;
        }
        System.out.println(fnl);
    }
}



// import java.util.*;
// public class Main {
//     // dec2bin
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//             long n = sc.nextInt();
//             long mult = 1;
//             long ans = 0;
//             while(n > 0){
//                 long rem = n%8;
//                 ans = ans +rem*mult;
//                 mult = mult*10;
//                 n=n/8;
//             }System.out.println(ans);
//     }
// }
