// topcoder: radicality

import java.util.*;

public class InterestingNumber {

	public String isInteresting(String x) {
		String YES = "Interesting", NO = "Not interesting";
		int[] cnt = new int[10];
		for(int i = 0; i < x.length(); i++) cnt[x.charAt(i)-'0']++;
		for(int i = 0; i < cnt.length; i++){
		    if(cnt[i] > 0 && cnt[i] != 2) return NO;
		}
		for(int i = 0; i < x.length(); i++){
		    
		    for(int j = i+1; j < x.length(); j++){
		        if(x.charAt(i) == x.charAt(j)){
		            if(j-i-1 != x.charAt(i)-'0') return NO;
		        }
		    }
		}
		
		
		return YES;
		
	}

}
