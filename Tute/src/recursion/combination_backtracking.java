package recursion;

public class combination_backtracking {
	public static void main(String[] args) {
	    int total = 5;
        combination(2,total,"",-1);
	}
	
	public static void combination(int toselect , int total , String path, int last){
	    if(toselect == 0){
	        System.out.println(path);
	        return;
	    }
	    for (int i=last+1;i<total;i++){
	        combination(toselect-1, total,path+"b"+i,i);
	    } 
	}

}
