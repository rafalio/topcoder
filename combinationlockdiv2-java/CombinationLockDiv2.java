import java.util.*;

public class CombinationLockDiv2 {
	int count = Integer.MAX_VALUE;
	
	public int minimumMoves(String S, String T) {
		int N = S.length();
		int[] S1 = new int[N];
		int[] T1 = new int[N];
		for(int i = 0; i < N; i++) S1[i] = S.charAt(i)-'0';
		for(int i = 0; i < N; i++) T1[i] = T.charAt(i)-'0';
		
		rec(S1,T1,0, new boolean[N]);
		
		return count;
	}
	
	void rec(int[] S, int[] T, int steps, boolean[] vis){
		if(same(S,T)){
			count = Math.min(count,steps);
		} else{
			int N = S.length;
			for(int i = 0; i < N; i++){
				if(!vis[i]){
					vis[i] = true;
					for(int j = i; j < N; j++){
						for(int d = 1; d <= 9; d++){
							for(int a = i; a < j; a++){
								
							}	
						}
					}
					vis[i] = false;
				}
			}
		}
	}
	
	public boolean same(int[] A, int[] B){
		for(int i = 0; i < A.length; i++){
			if(A[i] != B[i]) return false;
		}
		return true;
	}

}
