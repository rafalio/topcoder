import java.util.*;

public class MysticAndCandiesEasy {

	public int minBoxes(int C, int X, int[] high) {
		Arrays.sort(high);
		int out = 1000000;
		int N = high.length;
		
		int total = 0;
		for(int i : high) total += i;
		
		for(int i = N-1; i >= 0; i--){
			int sum = 0;
			for(int j = i; j >= 0; j--){
				sum += high[j];
				int rest = total-sum;
				if(C-rest <= sum && C-rest >= X){
					out = Math.min(out,i-j+1);
					break;
				}
			}
		}
		
		return out;
	}

}
