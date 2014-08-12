import java.util.*;

public class CatchTheBeatEasy {

	public String ableToCatchAll(int[] x, int[] y) {
	    Integer[] idxs = new Integer[x.length];
	    for(int i = 0; i < x.length; i++) idxs[i] = i;
	    Arrays.sort(idxs, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return Integer.compare(y[o1], y[o2]);
            }
	    });
	    int curpos = 0;
	    int t = 0;
	    for(int i = 0; i < x.length; i++){
	        if(Math.abs(curpos-x[idxs[i]]) > y[idxs[i]]-t) return "Not able to catch";
	        t += Math.abs(curpos-x[idxs[i]]);
	        curpos = x[idxs[i]];
	    }
	    return "Able to catch";
	}

}
