import java.util.*;

public class BigOEasy {
	int[] cycles = new int[50];

	public String isBounded(String[] graph) {
		int N = graph.length;
		boolean[][] g = new boolean[N][N];
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				g[i][j] = graph[i].charAt(j) == 'Y';
			}
		}
		boolean[] visited = new boolean[N];
		
		for(int i = 0; i < N; i++){
			if(!visited[i]){
				if(hasCycle(g,i,visited,new boolean[N])){
					boolean ok = true;
					for(int m = 0; m < N; m++){
						ok = ok && cycles[i] >= 2;
					}
					
					if(ok) return "Unbounded";
				}
			}
		}
		
		return "Bounded";
	}
	
	public boolean hasCycle(boolean[][] g, int node, boolean[] visited, boolean[] thisRun){
		if(thisRun[node]){
			cycles[node]++;
			return true;
		}
		thisRun[node] = true;
		
		boolean cycle = false;
		
		for(int i = 0; i < g.length; i++){
			if(g[node][i]){
				if(thisRun[i] && !visited[i]){
					cycle = true;
					cycles[i]++;
					break;
				}
				else{
					if(hasCycle(g,i,visited,thisRun)){
						cycles[i]++;
						cycle = true;
						if(cycles[i] >= 2) return true;
					}
				}
			}
		}
//		if(cycle) cycles[node]++;
		
		visited[node] = true;
		thisRun[node] = false;
		return cycle;
	}

}
