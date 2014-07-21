import java.util.*;

public class ColorfulCoinsEasy {

	public String isPossible(int[] values) {
		int N = values.length;
		int sum = 0;
		for(int v : values) sum += v;
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i = sum; i <= 1800000; i++){
			int val = i;
			for(int j = N-1; j >= 0; j--){
				if(val == 0) break;
				if(val >= values[j]){
					int howmany = val / values[j];
					val -= howmany*values[j];
					s.add(howmany);
				}
			}
			if(s.size() == N) return "Possible";
			else s.clear();
		}
		return "Impossible";
	}

}
