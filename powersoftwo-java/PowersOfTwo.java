// topcoder: radicality

import java.util.*;

public class PowersOfTwo {
    int[] X;
    long DP[][];

	public long count(long[] powers) {
		X = new int[60];
		for(int i = 0; i < powers.length; i++) X[logpow(powers[i])]++;
		DP = new long[61][51];
		for(long[] i : DP) Arrays.fill(i,-1);
		return run(0,0);
	}
	
	public long run(int k, int b){
	    long res = DP[k][b];
	    if(res == -1){
	        if(k == X.length) res = 1; // only option is the empty set
	        else{
	            res = 0;
	            int xk = X[k] + b; // the new value of xk
	            
	            // Make the last bit 0
	            res += run(k+1,xk/2);
	            // Make the last bit 1, so need at least one of them to use
	            if(xk > 0){
	                res += run(k+1,(xk-1)/2);
	            }
	            
	        }
	        DP[k][b] = res;
	    }
	    return res;
	}
	
	public int logpow(long n){
	    if(n == 1) return 0;
	    else return 1 + logpow(n/2);
	}

}
