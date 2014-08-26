import java.util.*;

public class ChooseTheBestOne {

	public int countNumber(int N) {
		ArrayList<Integer> C = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) C.add(i+1); // 1..N
		long i = 0;
		long t = 1;
		while(C.size() > 1){
		    i = (i + t*t*t - 1) % C.size();
		    C.remove((int)i);
		    t++;
		}
		return C.get(0);
	}

}
