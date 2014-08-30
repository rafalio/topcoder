import java.util.*;

public class WakingUpEasy {

	public int countAlarms(int[] volume, int S) {
		int ret = 0;
		int alarm = 0;
		while(S > 0){
		    S -= volume[alarm];
		    alarm = (alarm+1)%volume.length;
		    ret++;
		}
		return ret;
	}

}
