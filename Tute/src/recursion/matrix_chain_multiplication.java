package recursion;

public class matrix_chain_multiplication {
	
	public static void main(String args[])
    {
        int arr[] = new int[] { 1, 2, 3, 4, 3 };
        int n = arr.length;
 
        System.out.println(
            "Minimum number of multiplications is "
            + mat_chain_mul(arr, 1, n - 1));
    }
	
	public static int mat_chain_mul(int p[] , int i , int j){
	    if(i == j){
	        return 0;
	    }
	    int min = Integer.MAX_VALUE;
	    for (int k = i; k < j; k++)
        {
            int count = mat_chain_mul(p, i, k)
                        + mat_chain_mul(p, k + 1, j)
                        + p[i - 1] * p[k] * p[j];
 
            if (count < min)
                min = count;
        }
        return min;
	}

}
