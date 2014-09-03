// topcoder: radicality

import java.util.*;

public class ElephantDrinkingEasy {
    
    public int maxElephants(String[] map) {
        this.map = map;
        int N = map.length;
        int res = 0;
        for(int t = 0; t < (1 << N); t++){ // top elephants
            for(int b = 0; b < (1 << N); b++){ // bottom elephants
                boolean[][] T = new boolean[N][N];
                
                boolean allOk = true;
                for(int i = 0; i < N; i++){
                    if( ((t >> i) & 1) == 1){
                        allOk = allOk && simulate(0,i,1,0,T);
                    }
                    if( ((b >> i) & 1) == 1){
                        allOk = allOk && simulate(N-1,i,-1,0,T);
                    }
                }
                
                if(allOk){
                    int elephants = Integer.bitCount(t) + Integer.bitCount(b);
                    
                    for(int i = 0; i < N; i++){
                        if(simulate(i,0,0,1,T)) elephants++;
                        if(simulate(i,N-1,0,-1,T)) elephants++;
                    }    
                    res = Math.max(res,elephants);
                }

            }
        }
        return res;
    }
    
    String[] map;

    public boolean simulate(int i, int j, int di, int dj, boolean[][] T){
        int N = map.length;
        for(int a = i, b = j; inBounds(a,b,N) ; a += di, b += dj){
            if(T[a][b]) return false; // blocked
            else if(map[a].charAt(b) == 'Y'){
                while(!(a == i && b == j)){
                    T[a][b] = true;
                    a -= di;
                    b -= dj;
                }
                T[i][j] = true;
                return true;
            }
        }
        return false;
    }
    
    
	
	public boolean inBounds(int i, int j, int N){
	    return i >= 0 && i < N && j >= 0 && j < N;
	}
	
	public boolean isEdge(int i, int j, int N){
	    return (i == 0 || j == 0 || i == N-1 || j == N-1);
	    
	}

}
