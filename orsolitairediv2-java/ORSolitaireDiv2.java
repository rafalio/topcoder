import java.util.*;

public class ORSolitaireDiv2 {
	
	int theMin = 0;

	public int getMinimum(int[] numbers, int goal) {
		int N = numbers.length;
		boolean[] mask = new boolean[N];
		int ret = run(numbers, goal, mask, 0);
		
		if(ret == Integer.MAX_VALUE) return 0;
		return ret;
		
//		if(theMin == Integer.MAX_VALUE) return 0;
//		return theMin;
	}
	
	private int run(int[] numbers, int goal, boolean[] mask, int step){
		if(step == numbers.length){
			int n = 0;
			int cnt = 0;
			for(int i = 0; i < numbers.length; i++){
				if(mask[i]){
					n = n | numbers[i];
					cnt++;
				}
			}
			if(n == goal) return cnt-1; // take away one
			else{
				theMin = Math.max(theMin, cnt);
				return Integer.MAX_VALUE;
			}
		}
		else{
			int best = Integer.MAX_VALUE;
			for(boolean b : new boolean[]{false,true}){
				mask[step] = b;
				int thisRun = run(numbers, goal, mask, step+1);
				best = Math.min(best, thisRun);
			}
			return best;
		}
	}
	

}
