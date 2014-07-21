public class PaperRockScisQuals {

	public int whoPassed(String[] players) {
		int N = players.length;
		double[] points = new double[N];
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				int t1 = 0;
				int t2 = 0;
				for(int c = 0; c < 5; c++){
					char P1 = players[i].charAt(c);
					char P2 = players[j].charAt(c);
					if(P1 == P2) continue;
					if(beats(P1,P2)) t1++;
					else t2++;
				}
				if(t1 > t2){
					points[i]++;
				}
				
				else if(t2 > t1){
					points[j]++;
					
				} else{
					points[i] += 0.5;
					points[j] += 0.5;
				}
			}
		}
		
		int winner = 0;
		double mpoints = points[0];
		for(int i = 1; i < N; i++){
			if(points[i] > mpoints){
				winner = i;
				mpoints = points[i];
			}
		}
		
		return winner;

			
	}
	// P Q R S T
	public boolean beats(char A, char B){
		if(A == 'P' && B == 'R') return true;
		if(A == 'R' && B == 'S') return true;
		if(A == 'S' && B == 'P') return true;
		return false;
	}

}
