import java.util.*;

public class CatsOnTheLineDiv2 {

    // during contest
    // NOTES: no need to use a set, just wanted to do it quickly...
	public String getAnswer2(int[] position, int[] count, int time) {
		String YES = "Possible", NO = "Impossible";
		
		TreeSet<Integer> S = new TreeSet<Integer>();
		
		int N = position.length;
		Integer[] idxs = new Integer[N];
		for(int i = 0; i < N; i++) idxs[i] = i;
		Arrays.sort(idxs, (Integer a, Integer b) -> Integer.compare(position[a], position[b]));
		
		for(int i = 0; i < N; i++){
		    int idx = idxs[i];
		    int pos = position[idx];
		    int cnt = count[idx];
		    
		    int last = -50000;
		    if(S.size() >= 1) last = S.last();
		    for(int t = -time; t <= time && cnt >= 1; t++){
		        if(pos+t <= last) continue;
		        S.add(pos+t);
		        cnt--;
		    }
		    if(cnt > 0) return NO;
		    
		}
		
		return YES;
	}
	
	// Proper way with O(1) memory, but just slightly more tricky.
	public String getAnswer(int[] position, int[] count, int time){
	    String YES = "Possible", NO = "Impossible";
	    int N = position.length;
	    Integer[] idxs = new Integer[N];
	    for(int i = 0; i < N; i++) idxs[i] = i;
	    Arrays.sort(idxs, (a,b) -> Integer.compare(position[a],position[b]));
	    
	    int last = 0;
	    
	    for(int i = 0 ; i < N; i++){
	        int cnt = count[idxs[i]];
	        int pos = position[idxs[i]];
	        
	        int start = pos-time;
	        if(i >= 1){
	            start = Math.max(last+1, pos-time);
	        }
	        if(start + cnt - 1 > pos+time) return NO;
	        last = start+cnt-1;
	    }
	    return YES;
	    
	    
	}
	
}
