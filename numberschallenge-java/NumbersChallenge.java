import java.util.*;

public class NumbersChallenge {

	public int MinNumber(int[] S) {
	    int N = S.length;
	    
	    boolean[] V = new boolean[2000001];
	    
	    for(int m = (1 << N)-1; m >= 1; m--){
	        int sum = 0;
	        for(int j = 0; j < N; j++){
	            if( ((m >> j) & 1) == 1){
	                sum += S[j];
	            }
	        }
	        V[sum] = true;
	    }
	    for(int i = 1; i < V.length; i++){
	        if(!V[i]) return i;
	    }
	    return 1;
	}

}
