import java.util.*;

public class SilverbachConjecture {

	public int[] solve(int n) {
	    for(int i = 2; i < n-1; i++){
	        if(composite(i) && composite(n-i)) return new int[]{i,n-i};
	    }
	    return new int[]{0,0};
	}
	
	private boolean composite(int i){
	    for(int j = 2; j < i; j++){
	        if(i % j == 0) return true;
	    }
	    return false;
	}

}
