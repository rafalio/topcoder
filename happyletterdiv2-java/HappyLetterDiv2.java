import java.util.*;

public class HappyLetterDiv2 {
	
	boolean nosol = false;
	boolean[] winners;

	public char getHappyLetter(String letters) {
		int N = letters.length();
		winners = new boolean[26];
		
		
		int[] cntArr = new int[26];
		for(char c : letters.toCharArray()){
			cntArr[c-97]++;
		}
		
		rec(cntArr);
		
		if(nosol) return '.';
		else{
			int cnt = 0;
			int idx = 0;
			for(int i = 0; i < N; i++){
				if(winners[i]){
					cnt++;
					idx = i;
				}
			}
			if(cnt == 1){
				return (char)(idx+97);
			}
			else return '.';
		}
	}
	
	private void rec(int[] cnt){
		int u = unique(cnt);
		if(allZeros(cnt)){
			nosol = true;
			return;
		}
		else if(u != -1){
			winners[u] = true;
			
		} else{
			for(char c = 'a'; c <= 'z'; c++){
				for(char c1 = (char) (c+1); c1 <= 'z'; c1++){
					if(cnt[c-97] > 0 && cnt[c1-97] > 0){
						cnt[c-97]--;
						cnt[c1-97]--;
						rec(cnt);
						cnt[c-97]++;
						cnt[c1-97]++;
					}
				}
			}
		}
	}
	
	private boolean allZeros(int[] cnt){
		for(int i : cnt){
			if(i > 0) return false;
		}
		return true;
	}
	
	private int unique(int[] cnt){
		int idx = -1;
		for(int i = 0; i < cnt.length; i++){
			if(cnt[i] > 0 && idx != -1) return -1;
			else if(cnt[i] > 0) idx = i;
		}
		return idx;
	}

}
