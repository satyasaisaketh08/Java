package recursion;

public class recur_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int i = 1;
//		sum_of_nnatural(i ,n ,0);
//		System.out.println(factorial(n));
		fibonacci_recur(n);
	}

	public static void fibonacci_recur(int n) {
		// TODO Auto-generated method stub
		
		
	}

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 1 || n == 0) {
//			System.out.println(1);
			return 1;
		}
		return (n*factorial(n-1));
		
	}

	public static void sum_of_nnatural(int i, int n, int sum) {
		// TODO Auto-generated method stub
		if(i==n) {
			sum = sum+i;
			System.out.println(sum);
			return;
		}
		sum  = sum+i;
		sum_of_nnatural(i+1,n, sum);
		
	}
	// Recursion
//	import java.util.*;
//	public class Main
//	{
//		public static void main(String[] args) {
//		   // Scanner sc = new Scanner(System.in);
//		   // String s = sc.next(); 
//			int n = 5;
//	 		inc_seq(5);
//	 		dec_seq(5);
	        // System.out.println(factorial(n));
	        // dec_inc_seq(n);
	        // inc_dec_seq(1,20);
//	        // System.out.println(exp(1,2));
//	        // System.out.println(str_toint(s));
//	        // System.out.println(fib(6));
//	        int[] arr = {1,2,3,4,5,6};
//	        // System.out.println(max_inarr(arr , 0));
//	        // System.out.println(min_inarr(arr , 0));
//	        // reverse_arr(arr,0);
//	        System.out.println(first_occurence(arr,0,15));
//	        
//		}
		
		public static void dec_seq(int n){
		    if(n==0){
		        return ;
		    }else{
		        System.out.println(n);
		        dec_seq(n-1);
		    }
		}
		
		public static void inc_seq(int n){
		    if(n==1){
		        System.out.println(1);
		        return;
		    }else{
		        inc_seq(n-1);
		        System.out.println(n);
		    }
		}
		
		public static void dec_inc_seq(int n){
		    if(n==0){
		        return;
		    }
		    System.out.println(n);
	    	dec_inc_seq(n-1);
	    	System.out.println(n);
		}
		
		public static void inc_dec_seq(int n , int limit){
		    if(n== limit + 1){
		        return;
		    }
		    System.out.println(n);
		    inc_dec_seq(n+1 , limit);
		    System.out.println(n);
		}
		
		public static int factorial(int n){
		    if(n==1){
		       // System.out.println(1);
		        return 1;
		    }else{
		        return (n*factorial(n-1));
		    }
		}
		
		public static int exp(int x , int n){
		    if(n==0){
		        return 1;
		    }
		    
		    return (exp(x, n-1) * x);
		}
		
		public static int str_toint(String s){
		    return (Integer.parseInt(s));
		}
		
		public static int fib(int n){
		    if(n <= 1){
		        return n;
		    }
		    int sp1 = fib(n-1);
		    int sp2 = fib(n-2);
		    
		    return sp1 + sp2;
		}
		
		public static int max_inarr(int[] arr , int idx){
		   if(idx == arr.length-1){
		       return arr[idx];
		   }
		   int sp = max_inarr(arr, idx+1);
		   return (Math.max(arr[idx], sp));
		}
		
		public static int min_inarr(int[] arr , int idx){
		   if(idx == arr.length-1){
		       return arr[idx];
		   }
		   int sp = min_inarr(arr, idx+1);
		   return (Math.min(arr[idx], sp));
		}
		
		public static void reverse_arr(int[] arr, int idx){
		    if(idx == arr.length){
		        return;
		    }
		    
		    reverse_arr(arr , idx+1);
		    System.out.print(arr[idx]);
		}
		
		public static int first_occurence(int[] arr , int idx, int ele){
		    
		    if(idx == arr.length){
		        return -1;
		    }
		    int sp =  first_occurence(arr, idx+1, ele);
		    
		    if(arr[idx]== ele){
		        return arr[idx];
		    }else{
		        return sp;
		    }
		  
		}
		
		public static int last_occurence(int[] arr, int idx, int ele){
		    
		}

//	---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	New methods of recu	public class Main
//	{
//		public static void main(String[] args) {
//			int n = 5;
////	 		pdi(n);
//	        // System.out.println(factorial(n));
//	        System.out.println(fibo(n));
//		}rsion and above also correct 

////	
		
		public static void pd(int n){
		    if(n==0){
		        return;
		    }else{
		        System.out.println(n);
		        pd(n-1);
		    }
		}
		
		public static void pi(int n){
		    if(n == 0){
		        return;
		    }else{
		        pi(n-1);
		        System.out.println(n);
		    }
		}
		
		public static void pdi(int n){
		    if(n==0){
		        return;
		    }else{
		        pd(n);
		        pi(n);
		    }
		}
		
		public static int factorial1(int n){
		    if(n == 1){
		        return 1;
		    }else{
		        return (n * factorial(n-1));
		    }
		}
		
		public static int fibo(int n){
		    if(n==0 || n==1){
		        return 1;
		    }else{
		        return (fibo(n-1) + fibo(n-2));
		    }
		}
		
		public static int max_inarr(int[] arr , int idx){
		   if(idx == arr.length-1){
		       return arr[idx];
		   }
		   int sp = max_inarr(arr, idx+1);
		   return (Math.max(arr[idx], sp));
		}
		
	}

		
		
	}


}
