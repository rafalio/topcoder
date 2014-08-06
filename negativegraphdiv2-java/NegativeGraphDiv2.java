import java.util.*;

public class NegativeGraphDiv2 {

	public long findMin(int N, int[] s, int[] t, int[] weight, int charges) {
		int[][][] C = new int[N+1][N+1][charges+1];
		
		ArrayList<Integer>[][] ws = new ArrayList[N+1][N+1];
		
		
		for(int i=0; i <= N; i++){
			for(int j=0; j <= N; j++){
				for(int c = 0; c < charges+1; c++){
					C[i][j][c] = Integer.MAX_VALUE;
				}
			}
		}
		
		for(int i=0; i <= N; i++){
			C[i][i][0] = 0;
		}
		
		for(int i=0; i < s.length; i++){ // forall edges
			C[s[i]][t[i]][0] = Math.min(C[s[i]][t[i]][0],weight[i]);
			
			if(ws[s[i]][t[i]] == null){
				ws[s[i]][t[i]] = new ArrayList<Integer>();
			}
			ws[s[i]][t[i]].add(weight[i]);
			
		}
		
		for(int c = 1; c <= charges; c++){
			for(int k = 1; k <= N; k++){
				for(int i = 1; i <= N; i++){
					for(int j = 0; j < N; j++){
						int p1 = -C[i][k][c-1] + C[k][j][c-1];
						int p2 = C[i][k][c-1] - C[k][j][c-1];
						C[i][j][c] = Math.min(C[i][j][c-1],p1+p2);
					}
				}
			}			
		}

		
		
		return C[1][N][charges];
	}
	

}
