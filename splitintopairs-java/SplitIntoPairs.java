import java.util.*;

public class SplitIntoPairs {

	public int makepairs(int[] A, int X) {
		Arrays.sort(A);
		int negs = 0;
		for(int i : A) if(i < 0) negs++;
		
		int[] N = new int[negs];
		int[] P = new int[A.length-negs];
		int j = 0;
		int k = 0;
		for(int i = A.length-1; i >= 0; i--){
			if(A[i] < 0){
				N[j] = A[i];
				j++;
			} else{
				P[k] = A[i];
				k++;
			}
		}
		Arrays.sort(P);
		
		int ret = A.length/2;
		
		if(P.length % 2 == 0) return ret;
		
		if(P[0] > (double)X/(double)N[0]) return ret-1; 
		else return ret;
		
	}

}
