import java.util.*;

public class TheShuttles {

	public int getLeastCost(int[] cnt, int baseCost, int seatCost) {
		int leastCost = Integer.MAX_VALUE;
		
		for(int sh = 1; sh <= 5000; sh++){
			loop:
			for(int seats = 1; seats <= 100; seats++){
				int shuttles = sh;
				
				for(int i = 0; i < cnt.length; i++){
					int needed = (cnt[i]+seats-1) / seats;
					shuttles -= needed;
					if(shuttles < 0) continue loop;
				}
				
				leastCost = Math.min(leastCost, sh*(baseCost+seatCost*seats));
			}
		}
		
		return leastCost;
	}

}
