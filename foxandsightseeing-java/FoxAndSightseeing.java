import java.util.*;

public class FoxAndSightseeing {

	public int getMin(int[] position) {
		int dist = 0;
		int N = position.length;
		for(int i = 0; i < N-1; i++){
			dist += Math.abs(position[i]-position[i+1]);
		}
		int minDist = dist;
		for(int i = 1; i < N-1; i++){
			int d = dist;
			d -= Math.abs(position[i]-position[i-1]);
			d -= Math.abs(position[i]-position[i+1]);
			d += Math.abs(position[i-1]-position[i+1]);
			minDist = Math.min(minDist,d);
		}
		return minDist;
	}

}
