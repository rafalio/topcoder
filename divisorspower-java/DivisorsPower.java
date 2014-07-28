import java.util.*;

public class DivisorsPower {

	public long findArgument(long n) {
		long res = Long.MAX_VALUE;
		for(int i = 2; i <= 60; i++){
			long root = getRoot(n,i);
			if(root != -1 && countDivisors(root) == i){
				res = Math.min(res,root);
			}
		}
		if(res == Long.MAX_VALUE) return -1;
		return res;
	}
	
	// find the r-th root of n. Need to compensate for floating-point errors
	public long getRoot(long n, long r){
		long f = (long)Math.pow(n, 1.0/(double)r);
		
		for(long i=f; i <= f+1; i++){
			long m = 1;
			for(long j=1; j <= r; j++) m *= i;
			if(m == n) return i;
		}
		return -1;
	}
	
	// Count the number of divisors
	public long countDivisors(long n){
		long p = 1;
		long c = 0;
		while(p <= n/p){
			if(n % p == 0){
				c++;
				if(p != n / p) c++;
			}
			p++;
		}
		return c;
	}
}
