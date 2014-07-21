import java.util.*;

public class ManySquares {

	public int howManySquares(int[] sticks) {
		int[] sts = new int[1001];
		
		for(int i : sticks) sts[i]++;
		
		int ret = 0;
		for(int i : sts){
			ret += (int)i/4;
		}
		
		return ret;
		
	}

}
