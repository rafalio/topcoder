import java.util.*;

public class DoubleLetter {

	public String ableToSolve(String S) {
	    while(true){
	        if(S.length() == 0) return "Possible";

            boolean ok = false;
	        for(int i = 0; i < S.length()-1; i++){
	            if(S.charAt(i) == S.charAt(i+1)){
	                String N = S.substring(0, i); 
	                if(i + 2 < S.length()){
	                    N += S.substring(i+2, S.length());
	                }
	                ok = true;
	                S = N;
	                break;
	            }
	        }
	        if(!ok) return "Impossible";
	        
	    }
	    
	}

}
