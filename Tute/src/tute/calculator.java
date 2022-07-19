package tute;
import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sol = 0;
        do{
//            // char op = sc.next().charAt(0);
//            if(op == 'x' || op == 'X'){
//                break;
//            }
        }while(op != 'x' || op != 'X');
        {
        switch(op){
            case '+':
            sol = n1 + n2;
            System.out.println(sol);
            break;

            case '-':
            sol = n1 - n2;
            System.out.println(sol);
            break;

            case '*':
            sol = n1*n2;
            System.out.println(sol);
            break;

            case '/':
            sol = n1/n2;
            System.out.println(sol);
            break;

            case '%':
            sol = n1%n2;
            System.out.println(sol);
            break;

//            case 'x':
//            System.exit(0);
//
//            case 'X':
//            System.exit(0);

            default:
            System.out.println("Invalid operation. Try again");
        }
        }
        

        
    }
}
