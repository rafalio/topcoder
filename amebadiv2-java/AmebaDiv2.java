// topcoder: radicality

import java.util.*;

public class AmebaDiv2 {

	public int simulate(int[] X, int A) {
		int size = A;
		for(int i : X){
		    if(i == size) size *= 2;
		}
		return size;
	}

}
