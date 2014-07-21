public class BigBurger {

	public int maxWait(int[] arrival, int[] service) {
		int maxWait = 0;
		int N = arrival.length;
		if(N == 1) return 0;
		int lastServeTime = arrival[0]+service[0];
		
		for(int i = 1; i < N; i++){
			if(arrival[i] < lastServeTime){
				maxWait = Math.max(maxWait, lastServeTime-arrival[i]);
				lastServeTime += service[i];
			} else{
				lastServeTime = arrival[i]+service[i];
			}
		}

		return maxWait;
	}

}
