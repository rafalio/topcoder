import java.util.*;


/*
 * Notes: was too slow. Not the optimal algorithm in solution, but it works.
 * 
 */


public class Filtering {

	public int[] designFilter(int[] sizes, String outcome) {
		int[] res = new int[2];
		int best = Integer.MAX_VALUE;
		
		for(int a = 1; a <= 100; a++){
			for(int b = a; b <= 100; b++){
				
				boolean ok = true;
				for(int i = 0; i < outcome.length(); i++){
					if(outcome.charAt(i) == 'A'){
						if(! (sizes[i] >= a && sizes[i] <= b)) ok = false;
					}
					if(outcome.charAt(i) == 'R'){
						if((sizes[i] >= a && sizes[i] <= b)) ok = false;
					}
				}
				
				if(ok){
					if(b-a < best){
						best = b-a;
						res[0] = a;
						res[1] = b;
					}
				}
			}
		}
		if(best == Integer.MAX_VALUE) return new int[0];
		return res;
	}

}
