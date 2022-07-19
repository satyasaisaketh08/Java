package ass_2;

import java.util.*;
public class pattern_number_ladder  
{              
public static void main(String[] args)   
{  
    Scanner sc = new Scanner(System.in);
    int k = 1;
    int n = sc.nextInt();  
for (int i = 1; i <= n; i++)   
{   
for (int j = 1; j< i + 1; j++)   
{    
System.out.print(k++ + "\t ");  
}    
System.out.println();  
}  
}  
} 