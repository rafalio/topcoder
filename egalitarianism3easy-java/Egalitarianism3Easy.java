import java.util.*;

public class Egalitarianism3Easy {

    // inferior method that that I made a silly mistake in during competition
    // use the bitmask method below
    
    
//	public int maxCities(int n, int[] a, int[] b, int[] len) {
//	    int[][] D = new int[n+1][n+1];
//	    for(int i = 1; i < n+1; i++){
//	        Arrays.fill(D[i], 50000);
//	    }
//	    for(int i = 0; i < a.length; i++){
//	        D[a[i]][b[i]] = len[i];
//	        D[b[i]][a[i]] = len[i];
//	        D[i+1][i+1] = 0;
//	    }
//	    for(int k = 1; k <= n; k++){
//	        for(int i = 1; i <= n; i++){
//	            for(int j = 1; j <= n; j++){
//	                D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
//	                D[j][i] = D[i][j];
//	            }
//	        }
//	    }
//	    
////	    for(int i = 1; i <= n; i++){
////	        for(int j = 1; j <= n; j++){
////	            System.out.println("D[" + i + "][ " + j + "] = "+ D[i][j]);
////	        }
////	    }
//	    
//	    for(int k = n; k >= 2; k--){
//	        if(run(D,k,1,0,new boolean[n+1],n)) return k;
//	    }
//	    System.out.println("finished");
//	    return 1;
//	    
//	}
//	
//	public boolean run(int[][] D, int k, int cur, int total, boolean[] mask, int n){
//	    if(total == k){
////	        for(int i = 1; i <= n; i++){
////	            if(mask[i]) System.out.print(i + " ");
////	        }
////	        System.out.println("Finished and k was " + k);
//	        
//	        
//	        boolean allSame = true;
//	        int dist = -1;
//	        
//	        for(int i = 1; i <= n; i++){
//	            for(int j = i+1; j <= n; j++){
//	                if(mask[i] && mask[j]){
//	                    if(dist == -1) dist = D[i][j];
//	                    allSame = allSame && (D[i][j] == dist);
//	                }
//	            }
//	        }
//	        return allSame;
//	    }
//	    else if(cur <= n){
//            mask[cur] = true;
//            if(run(D,k,cur+1,total+1,mask,n)) return true;	        
//	        mask[cur] = false;
//	        if(run(D,k,cur+1,total,mask,n)) return true;
//
//	    }
//	    return false;
//	}
    
    
    public int maxCities(int n, int[] a, int[] b, int[] len) {
        int[][] D = new int[n+1][n+1];
        for(int i = 0; i < D.length; i++){
            Arrays.fill(D[i], 50000);
        }
        for(int i = 1; i <= n; i++){
            D[i][i] = 0;
        }
        for(int i = 0; i < a.length; i++){
            D[a[i]][b[i]] = len[i];
            D[b[i]][a[i]] = len[i];
        }
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j]);
                }
            }
        }
        
        int best = 1;
        
        for(int m = (1 << n) - 1; m >= 0; m--){
            boolean[] M = new boolean[n+1];
            
            int cnt = 0;
            for(int j = 0; j < n; j++){
                if( ((m >> j) & 1) == 1){
                    M[j+1] = true;
                    cnt++;
                }
            }
            
            boolean allSame = true;
            int dist = -1;
            out: for(int i = 1; i <= n; i++){
                for(int j = i+1; j <= n; j++){
                    if(M[i] && M[j]){
                        if(dist == -1) dist = D[i][j];
                        allSame = allSame && (D[i][j] == dist);
                        if(!allSame) break out;
                    }
                }
            }
            if(allSame) best = Math.max(best, cnt);   
        }
        
        return best;
    }

}
