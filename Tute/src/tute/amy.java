package tute;

import java.util.Scanner;

public class amy {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			int t =sc.nextInt();
			while(t>0) {
				
			
				int x = sc.nextInt();
				int y = sc.nextInt();
				int [] arr = {2,1};
				int p = 0,count =0;
				for(int k = 1;k<arr.length;k++) {
				
					for(int j = 0;j<=k;j++) {
						p = p+arr[j];
				
						if(isamy(x,y,p,arr[j])) {
							count++;
						}
						//System.out.println(p);
				}
				
			}
				if(count>0) {
					System.out.println(count);
				}
				else {
					System.out.println(0);
				}
				t--;
			}
			
 }
public static boolean isamy(int x,int y, int p, int n) {
	if(p+(y*n)==x) {
		return true;
	}
	return false;
}
}
