import java.util.*;

public class TwoWaysSorting {

	public String sortingMethod(String[] stringList) {
	    boolean lex = true;
	    boolean ord = true;
	    
	    int N = stringList.length;
	    for(int i = 0; i < N-1; i++){
	        if(! (stringList[i].length() <= stringList[i+1].length())) ord = false;
	        if(!lexLess(stringList[i],stringList[i+1])) lex = false;
	    }
	   
	    
	    if(lex && ord) return "both";
	    if(lex) return "lexicographically";
	    if(ord) return "lengths";
	    return "none";
	}
	
	public boolean lexLess(String s1, String s2){
	    int idx = 0;
	    while(idx < s1.length() && idx < s2.length()){
	        if(s1.charAt(idx) < s2.charAt(idx)) return true;
	        if(s1.charAt(idx) > s2.charAt(idx)) return false;
	        idx++;
	    }
	    if(idx == s1.length()) return true; // s1 is shorter
	    if(idx == s2.length()) return false; // s2 is shorter
	    return true;
	}

}
