import java.util.*;

public class PairGameEasy {

	public String able(int a, int b, int c, int d) {
		if(run(a,b,c,d)) return "Able to generate";
		return "Not able to generate";
	}
	
	public boolean run(int a, int b, int c, int d){
	    if(a == c && b == d) return true;
	    if(a > c || b > d) return false;
	    return run(a+b,b,c,d) || run(a,a+b,c,d);
	}

}
