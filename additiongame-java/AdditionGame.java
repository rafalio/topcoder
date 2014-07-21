import java.util.*;

public class AdditionGame {

	public int getMaximumPoints(int A, int B, int C, int N) {
		int score = 0;
		for(int i = 0; i < N; i++){
			if(A == 0 && B == 0 && C == 0) break;
			int max = Math.max(A,Math.max(B,C));
			score += max;
			if(A == max) A--;
			else if(B == max) B--;
			else if(C == max) C--;
			
		}
		return score;
	}

}
