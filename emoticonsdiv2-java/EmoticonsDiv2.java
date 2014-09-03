// topcoder: radicality

import java.util.*;

// two ways, one with global variable

public class EmoticonsDiv2 {
    int smiles;
    int steps = Integer.MAX_VALUE;
    
	public int printSmiles(int smiles) {
	    this.smiles = smiles;
//	    run(1,1,0);
	    return run2(1,1)+1;
//	    return steps+1;
	}
	
	public void run(int n, int k, int s){
	    if(n == smiles) steps = Math.min(steps,s);
	    else if(n+k <= smiles){
	        if(n != k) run(n,n,s+1);
	        run(n+k,k,s+1);
	    }
	}
	
	public int run2(int n, int k){
	    if(n == smiles) return 0;
	    else if(n + k <= smiles){
	        int res = run2(n+k,k);
	        if(n != k) res = Math.min(res, run2(n,n));
	        return res+1;
	    }
	    return 100000;
	}

}
