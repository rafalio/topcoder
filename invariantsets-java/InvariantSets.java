import java.util.*;

// didn't get this during the competition

public class InvariantSets {

	public long countSets(int[] f) {
		int N = f.length;
		
		boolean[][] adj = new boolean[N][N];
		
		// reachability matrix. adj[i][j] means there is a path from i to j in the graph
		
		for(int i = 0; i < N; i++){
			adj[f[i]][i] = true;
		}
		
		// floyd-warshall because its good enough for this
		for(int k = 0; k < N; k++){
			for(int i = 0; i < N; i++){
				for(int j = 0; j < N; j++){
					adj[i][j] = adj[i][j] || (adj[i][k] && adj[k][j]);
				}
			}
		}
		
		// assign groups to all numbers
		int[] groups = new int[N];
		Arrays.fill(groups, -1);
		
		int t = 0;
		for(int i = 0; i < N; i++){
			if(groups[i] == -1) dfs(i,t++,f,adj,groups);
		}
		
		
		// figure out parents. parent[i] = -1 if group i is a root
		int[] parent = new int[t];
		Arrays.fill(parent,-1);
		
		for(int i = 0; i < N; i++){
			if(groups[i] != groups[f[i]]){ // doesn't form a cycle
				parent[groups[i]] = groups[f[i]];
			}
		}
		
		for(int g : groups) System.out.println(g);
		System.out.println("parents");
		for(int p : parent) System.out.println(p);
		
		long[] dp = new long[t];
		Arrays.fill(dp,-1);
		
		long res = 1;
		for(int i = 0; i < t; i++){
			if(parent[i] == -1){ // root node
				res *= rundp(dp,i,parent);	
			}
		}
		
		System.out.println("------------");
		return res;
	}
	
	public long rundp(long[] dp, int x, int[] parent){
		if(dp[x] == -1){
			dp[x] = 1;
			for(int i = 0; i < parent.length; i++){
				if(parent[i] == x){
					dp[x] *= rundp(dp,i,parent);
				}
			}
			dp[x]++;
		}
		return dp[x];
	}
	
	public void dfs(int g, int c, int[] f, boolean[][] adj, int[] groups){
		if(groups[g] == -1){
			groups[g] = c;
			for(int i = 0; i < f.length; i++){
				if(adj[i][g] && adj[g][i]){
					dfs(i,c,f,adj,groups);
				}
			}
		}
	}

}
