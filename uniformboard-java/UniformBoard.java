import java.util.*;

public class UniformBoard {

	public int getBoard(String[] board, int K) {
	    int N = board.length;
	    int[][][] C = new int[N][N][2];
	    
	    for(int i = 0; i < N; i++){
	        int A = 0;
	        int P = 0;
	        for(int j = 0; j < N; j++){
	            char ch = board[i].charAt(j);
	            if(ch == 'A') A++;
	            if(ch == 'P') P++;
	            
	            if(i >= 1){
//	                C[i][j][toIdx(ch)] =  
	            }
	        }
	    }
	    
	    
	    
	}
	
	int toIdx(char p){
	    if(p == 'A') return 0;
	    if(p == 'P') return 1;
	    return -1;
	}

}
