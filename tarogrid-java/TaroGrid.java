import java.util.*;

public class TaroGrid {

	public int getNumber(String[] grid) {
	    int N = grid.length;
        int max = 0;
	    for(int col = 0; col < N; col++){
	        for(int i = 0; i < N; i++){
	            char c = grid[i].charAt(col);
	            int cnt = 1;
	            for(int j = i+1; j < N; j++){
	                if(grid[j].charAt(col) != c) break;
	                else cnt++;
	            }
	            max = Math.max(cnt,max);
	        }
	        
	    }
	    return max;
	}

}
