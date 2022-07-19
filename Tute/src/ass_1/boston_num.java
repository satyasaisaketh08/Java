package ass_1;

import java.util.*;
public class boston_num {
  static int prime_factorsadd(int n) {
    int prime_facsum = 0;
    // int count = 0;
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
          int j =i;
          if(i>9){
            while(j!=0){
                prime_facsum += j%10;
                j = j/10;
            }
          }else{
              prime_facsum += i;
          } n = n / i;
        
        }
        
      }
      return prime_facsum;
    }

  static int num_sum(int m) {
    int sum2 = 0;
    while (m != 0) {
      int digit = m % 10;
      sum2 += digit;
      m = m / 10;
    }
    return sum2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if (prime_factorsadd(num) == num_sum(num)) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

  }
}

// 
