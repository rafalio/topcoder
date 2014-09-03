// topcoder: radicality

import java.util.*;

public class LCMSetEasy {
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

	public String include(int[] S, int x) {
		int lcm = 1;
		for(int i : S){
		    if(x % i == 0){
		        lcm = lcm / gcd(lcm,i) * i;
		    }
		}
		
		if(lcm == x) return "Possible";
		return "Impossible";
	}

}
