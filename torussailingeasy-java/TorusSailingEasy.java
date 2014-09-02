// topcoder: radicality

import java.util.*;

public class TorusSailingEasy {

	public double expectedTime(int N, int M, int goalX, int goalY) {
		boolean[][] R = new boolean[N][M];
		int i = 0,j = 0;
		while(!R[i][j]){
		    R[i][j] = true;
		    i = (i+1) % N;
		    j = (j+1) % M;
		}
		if(!R[goalX][goalY]) return -1.0;
		
		// reachable
		
		i = 0; j = 0;
		int l = 0, r = 0;
		while(i != goalX && j != goalY){
		    i = (i+1) % N;
		    j = (j+1) % M;
		    l++;
		}
		i = 0; j = 0;
		while(i != goalX && j != goalY){
		    i = (i-1) % N;
		    j = (j-1) % M;
		    if(i < 0) i+=N;
		    if(j < 0) j+=M;
		    r++;
		}
		
//		double retL = l*Math.pow(0.5,l) + (l+2)*(l+2)*Math.pow(0.5,l+2);
//		double retR = r*Math.pow(0.5,r) + (r+2)*(r+2)*Math.pow(0.5,r+2);
//		double prevL = (l+2)*(l+2)*Math.pow(0.5,l+2);
//		double prevR = (r+2)*(r+2)*Math.pow(0.5,r+2);
//		
//		
		
//		return retL+retR;
	}

}
