package ass_1;
import java.util.Scanner;
public class inc_dec_seq { 
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        long prevS = scn.nextLong();
        boolean decre = true;
        N--;
        while(N != 0){
            long S = scn.nextLong();
            if(S<prevS){
                if(!decre){
                    System.out.println(false);
                    System.exit(0);
                }
            }if(prevS < S){
                if(decre){
                    decre = false;
                }
            }
            if(prevS == S){
                System.out.println(false);
                System.exit(0);
            }
            prevS = S;
            N--;
        }
        System.out.println(true);
    }
}