import java.util.*;

public class FoxPlayingGame {

	public double theMax(int nA, int nB, int paramA, int paramB) {
		double a = (double)(paramA)/1000;
		double b = (double)(paramB)/1000;
		
		double res = -1e100;
		
		res = Math.max(res, a*nA); // only additions
		res = Math.max(res, Math.pow(b,nB)*a*nA); // addition first, then multiplied by it
		
		if(b < 0){
			res = Math.max(a*nA*Math.pow(b,nB-1),res);
		}
		
		return res;
	}

}
