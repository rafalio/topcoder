import java.util.*;

public class GraphWalkWithProbabilities {

	public double findprob(String[] graph, int[] winprob, int[] looseprob, int start) {
		boolean[] visited = new boolean[graph.length];
		
		double[] costs = new double[graph.length];
		Arrays.fill(costs, Double.MAX_VALUE);
		costs[start] = 0;
		
		int bestNode = start;
		double bestP = winprob[start]/(double)(winprob[start] + looseprob[start]);
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		
		while(!q.isEmpty()){
			int node = q.poll();
			double score = winprob[node]/(double)(winprob[node] + looseprob[node]);
			if(score > bestP){
				bestP = score;
				bestNode = node;
			}
			visited[node] = true;
			for(int i = 0; i < graph[node].length(); i++){
				if(graph[node].charAt(i) == '1' && !visited[i]){
					q.add(i);
				}
			}
		}
		
		
		
		return 0.0;
	}

}
