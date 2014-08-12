import java.util.*;

public class CandyMaking {

	public double findSuitableDensity(int[] containerVolume, int[] desiredWeight) {
	    int N = containerVolume.length;
	    double[] ds = new double[N];
	    for(int i = 0; i < N; i++) ds[i] = (double)desiredWeight[i] / (double)containerVolume[i];
	    Arrays.sort(ds);
	    
	    double best_diff = Double.MAX_VALUE;

	    for(int i = 0; i < N; i++){
	        
	        double sum = 0;
	        double density = ds[i];
	        
	        for(int j = 0; j < N; j++){
	            sum += Math.abs(density*containerVolume[j] - desiredWeight[j]);
	        }
	        if(sum < best_diff){
	            best_diff = sum;
	        }	        
	    }
	    
	    return best_diff;
	}

}
