public class WidgetRepairs {

	public int days(int[] arrivals, int numPerDay) {
		int cnt = 0;
		int N = arrivals.length;
		for(int i = 0; i < N-1; i++ ){
			if(arrivals[i] == 0) continue;
			if(arrivals[i]-numPerDay > 0){
				arrivals[i+1] += (arrivals[i]-numPerDay);
			}
			cnt++;
		}
		cnt += (arrivals[N-1]+numPerDay-1)/numPerDay;
		
		return cnt;
	}

}
