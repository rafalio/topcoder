import java.util.*;

public class LongLongTripDiv2 {

	public String isAble(long D, int T, int B) {
		long tbd = (long)T*B - D;
		if(tbd < 0 || D < T) return "Impossible";
		if(tbd % (B-1) == 0) return "Possible";
		return "Impossible";
	}

}
