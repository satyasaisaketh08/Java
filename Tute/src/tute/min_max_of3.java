package tute;
public class min_max_of3
{
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(max(a,b,c));
		System.out.println(min(a,b,c));
	}
	
	public static int max(int a,int b,int c){
	    int temp = a;
	    
	    if(b  > temp){
	        temp = b;
	    }if(c  > temp){
	        temp = c;
	    }
	    return temp;
	}
	
	public static int min(int a, int b, int c){
	    int temp = a;
	    
	    if(b < temp){
	        temp = b;
	    }if(c  < temp){
	        temp = c;
	    }
	    return temp;
	    
	}
}
