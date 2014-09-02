// topcoder: radicality

import java.util.*;

public class MicroStrings {

	public String makeMicroString(int A, int D) {
		String ret = "";
		while(A >= 0){
		    ret += Integer.toString(A);
		    A -= D;
		}
		return ret;
	}

}
