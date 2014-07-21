public class Straights {

	public int howMany(int[] hand, int k) {
		int cnt = 0;
		int N = hand.length;
		
		for(int i = 0; i < N-k+1; i++){
			int c = 1;
			for(int j = 0; j < k; j++){
				c *= hand[i+j];
			}
			cnt += c;
		}
		return cnt;
	}

}
