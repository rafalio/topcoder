import java.util.*;

public class MakeSquare {

	public int minChanges(String S) {
		if(S.length() == 1) return 1;
		int res = Integer.MAX_VALUE;
		
		for(int i = 0; i <= S.length(); i++){
			res = Math.min(res, dist(S.substring(0, i), S.substring(i)));
		}
		
		return res;
	}
	
	public int dist(String A, String B){ // edit distance between A and B
		char[] As = A.toCharArray();
		char[] Bs = B.toCharArray();
		
		int[][] d = new int[As.length+1][Bs.length+1];
		
		for(int i = 1; i <= As.length; i++){
			d[i][0] = i;
		}
		
		for(int j = 1; j <= Bs.length; j++){
			d[0][j] = j;
		}
		
		for(int j = 1; j <= Bs.length; j++){
			for(int i = 1; i <= As.length; i++){
				if(As[i-1] == Bs[j-1]){
					d[i][j] = d[i-1][j-1];
				}
				else{
					d[i][j] = Math.min(d[i-1][j],Math.min(d[i][j-1],d[i-1][j-1]))+1;
				}
			}
		}
		
		return d[As.length][Bs.length];
		
	}

}
