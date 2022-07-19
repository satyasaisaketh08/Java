package ass_1;

import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;
        int count_factor = 0;

        while(i<=number){
            if(number%i == 0){
                count_factor+=1;
            }
            i++;
        }
        if(count_factor == 2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

    }
}
