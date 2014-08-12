import java.util.*;

public class CandyAddict {

	public long[] solve(int[] X, int[] Y, int[] Z) {
	    long[] result = new long[X.length];
	    
	    for(int i = 0; i < result.length; i++){
	        result[i] = solve((long)X[i],(long)Y[i],(long)Z[i]);
	        System.out.println(result[i]);
	    }
	    
	    
	    return result;
	}
	
	public long solve (long x, long y, long z){
	    long day = 0l;
	    long m = 0l;
	    long c = 0l;
	    
	    // at the end of this loop, we are the end of day `day`
	    while(true){
	        if(c == 0){
	            m += x;
	            c = (int) (m/y-1); // she eats one candy
	            m = m % y;
	            day++;
	            if(day == z) return m;
	        }
	        else{ // c >= 1
	            if(day + c >= z){
	                // need to find z
	                m += (z-day) * x;
	                return m;
	            }
	            else{ // not yet at z days
	                m += c*x;
	                day += c;
	                c = 0;
	            }
	        }
	    }
	    
	}

}
