import java.util.*;

public class NinePuzzle {
	
	int answer = Integer.MAX_VALUE;

	public int getMinimumCost(String init, String goal) {
		int[] is = new int[256];
		int[] gs = new int[256];
		
		int N = init.length();
		
		for(int i = 0; i < N; i++){
			is[init.charAt(i)]++;
			gs[goal.charAt(i)]++;
		}
		
		dfs(init.toCharArray(),goal.toCharArray(),0,0, is, gs);
		
		return answer;
	}	
	
	void dfs(char[] init, char[] goal, int ptr, int curcost, int[] is, int[] gs){
		if(same(is,gs)){
			answer = Math.min(answer,curcost);
		}
		
		if(ptr < init.length){
			if(init[ptr] == '*'){
				dfs(init,goal,ptr+1,curcost, is, gs);				
			}
			else{
				char saved = init[ptr];
				for(char c : "RGBY".toCharArray()){
					int cost = (c == saved) ? 0 : 1;
					init[ptr] = c;
					is[saved]--;
					is[c]++;
					dfs(init,goal,ptr+1,curcost+cost, is, gs);
					init[ptr] = saved; // put back
					is[saved]++;
					is[c]--;
				}
			}
		}
	}
	
	boolean same(int[] is, int[] gs){
		for(char c : "RGBY".toCharArray()){
			if(is[c] != gs[c]) return false;
		}
		return true;
	}
	

}
