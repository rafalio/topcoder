import java.util.*;

public class WakingUpEasy {

	public int countAlarms(int[] volume, int S) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i : volume) a.add(i);
		
		int i = 0;
		while(S > 0){
			int vol = a.remove(0);
			S -= vol;
			a.add(vol);
			i++;
		}
		return i;
	}

}
