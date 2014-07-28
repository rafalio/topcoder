import java.util.*;

public class Intersect {

	public int area(int[] X, int[] Y) {
		int N = X.length;
		
		int[] x = X.clone();
		int[] y = Y.clone();
		
		for(int i = 0; i < N; i += 2){
			x[i] = Math.min(X[i],X[i+1]);
			y[i] = Math.min(Y[i],Y[i+1]);
			x[i+1] = Math.max(X[i],X[i+1]);
			y[i+1] = Math.max(Y[i],Y[i+1]);
		}
		
		int lx = x[0];
		int ly = y[0];
		int hx = x[1];
		int hy = y[1];
		
		for(int i = 2; i < N; i+= 2){
			lx = Math.max(lx,x[i]);
			hx = Math.min(hx,x[i+1]);
			ly = Math.max(ly,y[i]);
			hy = Math.min(hy,y[i+1]);
		}
		if(lx >= hx || ly >= hy) return 0;
		
		return (hx-lx)*(hy-ly);

	}
	

}
