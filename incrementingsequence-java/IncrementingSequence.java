import java.util.*;

public class IncrementingSequence {

	// Not entirely sure why this greedy approach got AC, I'll think about it later
	
	public String canItBeDone(int k, int[] A) {
		int[] cnt = new int[51];
		for(int i : A) cnt[i]++;
		int N = A.length;
		
		for(int i = N; i >= 1; i--){
			if(cnt[i] == 0){
				boolean ok = false;
				for(int j = i-k; j >= 1; j -= k){
					if(cnt[j] > 1){
						cnt[j]--;
						cnt[i]++;
						ok = true;
						break;
					}
				}
				if(!ok) return "IMPOSSIBLE";
			}
		}
		
		if(ok(cnt,A)) return "POSSIBLE";
		return "IMPOSSIBLE";
	}
	
	boolean ok(int[] cnt, int[] A){
		for(int i = 1; i <= A.length; i++){
			if(cnt[i] != 1) return false;
		}
		return true;
	}

}
