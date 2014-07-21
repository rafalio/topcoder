import java.util.*;

public class SlimeXSlimonadeTycoon {

	public int sell(int[] morning, int[] customers, int stale_limit) {
		ArrayList<Integer> stale = new ArrayList<Integer>();
		
		int sold = 0;
		int N = morning.length;
		
		for(int i = 0; i < N; i++){
			stale.add(morning[i]);
			if(stale.size() > stale_limit) stale.remove(0);
			int toSell = customers[i];
			
			while(toSell > 0 && stale.size() > 0){
				int n = stale.get(0);
				if(n > toSell){
					sold += toSell;
					stale.set(0, n-toSell);
					break;
				}
				else{
					sold += n;
					toSell -= n;
					stale.remove(0);
				}
			}
			
		}

		
		return sold;
	}

}
