import java.util.*;

public class MyVeryLongCake {

	public int cut(int n) {
	    return n-totient(n);
	}
	
	public int totient(int n){
	    int ret = n;
	    for(int p : primeDivisors(n)){
	        ret = ret - ret/p;
	    }
	    return ret;
	}
	
	public List<Integer> primeDivisors(int n){
	    List<Integer> ret = new ArrayList<Integer>();
	    int p = 2;
	    while(p*p <= n){
	        if(n % p == 0) ret.add(p);
	        while(n % p == 0) n = n / p;
	        p++;
	    }
	    if(n > 1) ret.add(n);
	    return ret;
	}

}
