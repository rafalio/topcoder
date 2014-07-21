import java.util.*;

public class TheArithmeticProgression {

	public double minimumChange(int a, int b, int c) {
		int[] res = {2*a,2*b,2*c};
		for(int d = 0; d <= 2000; d++){
			for(int i = 0; i < 3; i++){
				res[i] += d;
				if(res[1]-res[0] == res[2]-res[1]) return (double)d/2;
				res[i] -= 2*d;
				if(res[1]-res[0] == res[2]-res[1]) return (double)d/2;
				res[i] += d;
			}
		}
		return 0;
	}

}
