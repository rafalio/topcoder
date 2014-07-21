import java.util.*;

public class ColorfulRoad {
	
	int minCost = Integer.MAX_VALUE;
	
	public int getMin(String road) {
		getMin(road.toCharArray(), 0, 0);
		return minCost == Integer.MAX_VALUE ? -1 : minCost;
	}
	
	private void getMin(char[] C, int idx, int cost){
		if(idx == C.length-1){
			minCost = Math.min(minCost,cost);
		} else{
			for(int i = idx+1; i < C.length; i++){
				if(C[i] == next(C[idx])){
					int c = i-idx;
					int thecost = c*c;
					getMin(C,i,cost+thecost);
				}
			}
		}
	}
	
	private char next(char C){
		if(C == 'R') return 'G';
		if(C == 'G') return 'B';
		if(C == 'B') return 'R';
		return 0;
	}

}
