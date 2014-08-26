import java.util.*;

public class BoxesDiv2 {

    // not very pretty :S work on being more efficient, and have a think
    // whether sometimes arraylist might be easier/less prone to error to use
    // than normal arrays.
    
    // Another note - use << and >> bitwise shifts for powers of 2, no
    // point in doing float artihmetic with Math.pow
    
	public int findSize(int[] candyCounts) {
	    int N = candyCounts.length;
	    int[] B = new int[11];
	    for(int i = 0; i < N; i++){
	        int idx =  (int)Math.ceil(Math.log(candyCounts[i])/Math.log(2));
	        B[idx]++;
	    }
	    
	    
	    for(int i = 0; i < 10; i++){
	        if(B[i] >= 2){
	            B[i+1] += B[i]/2;
	            B[i] = B[i] % 2;
	        }
	    }
	    int maxIdx = 0;
	    for(int i = 10; i >= 0; i--){
	        if(B[i] > 0){
	            maxIdx = i;
	            break;
	        }
	    }
	    int boxes = B[maxIdx];
	    for(int i = 0; i < maxIdx; i++){
	        if(B[i] > 0){
	            boxes++;
	            break;
	        }
	    }
	    
	    double r = Math.ceil(Math.log(boxes)/Math.log(2));
	    
	    
	    return (int)Math.pow(2, maxIdx+(int)r);
	    
	    
	}

}
