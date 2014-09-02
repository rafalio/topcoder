// topcoder: radicality

import java.util.*;

public class MinimumSquareEasy {

	public long minArea(int[] x, int[] y) {
	    long bestArea = Long.MAX_VALUE;
	    int N = x.length;
	    for(int i = 0; i < N; i++){
	        for(int j = i+1; j < N; j++){
	            // ignore the pair (i,j)
	            
	            int xMin = Integer.MAX_VALUE, yMin = Integer.MAX_VALUE;
	            int xMax = Integer.MIN_VALUE, yMax = Integer.MIN_VALUE;
	            
	            for(int k = 0; k < N; k++){
	                if(k == i || k == j) continue;
	                xMin = Math.min(xMin,x[k]);
	                yMin = Math.min(yMin,y[k]);
	                xMax = Math.max(xMax,x[k]);
	                yMax = Math.max(yMax,y[k]);
	            }
	            long largerSide = (long)Math.max(xMax-xMin, yMax-yMin);
	            bestArea = Math.min(bestArea, (largerSide+2)*(largerSide+2));
	        }
	    }
	    return bestArea;
	}


}
