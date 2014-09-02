import java.util.*;

public class TaroFriends {

	public int getNumber(int[] coordinates, int X) {
	    Arrays.sort(coordinates);
	    int res = Integer.MAX_VALUE;
	    int N = coordinates.length;
	    for(int lastRight = 0; lastRight+1 <= N; lastRight++){
	        int left = Math.min(coordinates[0]+X,coordinates[lastRight+1]-X);
	        int right = Math.max(coordinates[N-1]-X,coordinates[lastRight+1]+X);
	        res = Math.min(res,right-left);
	    }
	    return res;
	}

}
