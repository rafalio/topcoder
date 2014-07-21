import java.util.*;

public class SilverbachConjecture {

	public int[] solve(int n) {
		int N = 500;
		for(int i = 2; i < N; i++){
			for(int j = 2; j < N; j++){
				for(int a = 2; a < N; a++){
					for(int b = 2; b < N; b++){
						if(i*j + a*b == n){
							return new int[]{i*j,a*b};
						}
					}
				}
			}
		}
		return new int[]{0,0};
	}

}
