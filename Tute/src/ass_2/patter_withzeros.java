package ass_2;

import java.util.*;
public class patter_withzeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if(i==j || j==1){
            System.out.print(i + " \t");
        }else{
            System.out.print(0 + "\t ");
        }
      }
      System.out.println();
    }
  }
} 
