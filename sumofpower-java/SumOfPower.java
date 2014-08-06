import java.util.*;

public class SumOfPower {

	public int findSum(int[] array) {
		int res = 0;
		int N = array.length;
		
		for(int i = 0; i < N; i++){
			for(int j = i; j < N; j++){
				for(int k = i; k <= j; k++) res += array[k];
			}
		}
		
		
		return res;
	}

}
