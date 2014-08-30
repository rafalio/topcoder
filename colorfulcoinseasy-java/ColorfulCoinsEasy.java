import java.util.*;

public class ColorfulCoinsEasy {

	public String isPossible(int[] values) {
	    String YES = "Possible", NO = "Impossible";
	    
	    int N = values.length;
	    
	    for(int i = 20000*N + 1; i >= 1; i--){
	        Set<Integer> S = new HashSet<Integer>();
	        
	        int num = i;
	        for(int j = N-1; j >= 0 && num >= 1; j--){
	            int idx = num / values[j];
	            if(idx == 0) continue;
	            num -= idx*values[j];
	            S.add(idx);
	        }
	        if(S.size() == N){

	            for(int asdf : S){
	                System.out.println(asdf);
	            }
	               return YES;
	        }
	          
	    }
	    
	    return NO;
	}

}
