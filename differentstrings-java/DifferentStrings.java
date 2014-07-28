import java.util.*;

public class DifferentStrings {

	// 244 points 
	
	public int minimize(String A, String B) {
		if(A.length() > B.length()) return minimize(B,A);
		// A is shorter
		
		int aN = A.length();
		int bN = B.length();
		
		int best = Integer.MAX_VALUE;
		for(int i = 0; i < bN-aN+1; i++){
			
			int thisDist = 0;
			for(int j = 0; j < aN; j++){
				if(A.charAt(j) != B.charAt(i+j)) thisDist++;
			}
			best = Math.min(thisDist,best);
			
		}
		return best;

	}

}
