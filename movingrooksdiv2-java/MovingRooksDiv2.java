import java.lang.reflect.Array;
import java.util.*;

public class MovingRooksDiv2 {

	public String move(int[] Y1, int[] Y2) {
	    String YES = "Possible", NO = "Impossible";
	    Set<List<Integer>> visited = new HashSet<List<Integer>>();
	    Queue<List<Integer>> Q = new LinkedList<List<Integer>>();
	    Q.add(Arrays.asList(Y1));
	    int N = Y1.length;
	    
	    while(Q.size() > 0){
	        int[] top = Q.poll();
	        for(int i = 0; i < N; i++){
	            for(int j = i+1; j < N; j++){
	                if(top[i] > top[j]){
	                    swap(top, i, j);
	                    if(!visited.contains(top)){
	                        visited.add(top.clone());
	                        Q.add(top.clone());
	                    }
	                    swap(top, i ,j);
	                }
	            }
	        }
	    }
	    
	    if(visited.contains(Y2)) return YES;
	    return NO;
	    
	}
	
	private void swap(int[] a, int i1, int i2){
	    int tmp = a[i1];
	    a[i1] = a[i2];
	    a[i2] = tmp;
	}

}
