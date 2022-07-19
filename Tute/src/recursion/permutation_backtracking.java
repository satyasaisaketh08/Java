package recursion;

public class permutation_backtracking {
	public static void main(String[] args) {
	    int total = 5;
	    boolean selected[] = new boolean[total];
		permute(2,total,"",selected);
	}
	
	public static void permute(int toselect , int total , String path ,boolean selected[]){
	    if(toselect == 0){
	        System.out.println(path);
	        return;
	    }
	    for (int i=0;i<total;i++){
	        if(selected[i] == false){
	            selected[i] = true;
	            permute(toselect-1, total,path+"b"+i,selected);
	            selected[i]= false;
	    }
	    } 
	}

}
