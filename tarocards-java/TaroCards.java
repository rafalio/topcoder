import java.util.*;

// Interesting thing I learned about memoizing recursion


public class TaroCards {
    int[] F;
    int[] S;
    int k;
    long[][][] DP;
    int N;
    int maxDepth = 0;
    boolean doCnt = false;

	public long getNumber(int[] first, int[] second, int K) {
	    DP = new long[51][1024][41];
	    N = first.length;
	    for(long[][] i : DP){
	        for(long[] j : i) Arrays.fill(j,-1);
	    }
	    F = first;
	    S = second;
	    k = K;
	    for(int i = N; i >= 0; i--){
	        f(i,0,0,0);
	    }
	    doCnt = true;
	    long res = f(0,0,0,0);
	    System.out.println("Max depth: " + maxDepth);
	    return res; 
	}
	
	private long f(int i, int mask, int r, int depth){
	    if(doCnt) maxDepth = Math.max(maxDepth,depth);
	    long res = DP[i][mask][r];
	    if(res == -1){ // unsolved
	        if(i == N){
	            if(Integer.bitCount(mask) + r <= k) res = 1;
	            else res = 0;
	        }
	        else{ // i < N;
	            res = f(i+1,mask,r, depth+1); // don't use card i;
	            
	            int[] nums = {F[i],S[i]};
	            int nmask = mask;
	            int nr    = r;
	            for(int n : nums){
	                if(n <= 10){
	                    nmask = (nmask | (1 << (n-1)));
	                } else{
	                    nr++;
	                }
	            }
	            res += f(i+1,nmask,nr, depth+1);
	        }
	        DP[i][mask][r] = res;
	    }
	    return res;
	}

}
