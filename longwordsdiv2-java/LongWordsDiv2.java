import java.util.*;

public class LongWordsDiv2 {

    // 365/500 points. Correct on first try, but need to think a bit faster.
    // Also, vexorians reference solution does something different – it generates
    // all the XYXY strings and checks if they are subsequences. Don't think it's
    // any faster than mine though, and around the same implementation difficulty.
    
	public String find(String word) {
	    char[] C = word.toCharArray();
	    int N = word.length();
	    
	    for(int i = 0 ; i < N-1; i++){
	        if(C[i] == C[i+1]) return "Dislikes";
	    }
	    
	    // cnt[c][j] is the number of occurences of char c up to index j (inclusive)
	    int[][] cnt = new int[255][N];
	    for(int i = 0; i < N; i++){
	        if(i > 0){
	            for(char c : C) cnt[c][i] = cnt[c][i-1];
	        }
	        cnt[C[i]][i]++;
	    }
	    
	    // Look through all ordered tuples – If two letters are the same, ie we have
	    // X___X____, then iterate over all the characters between the two X's, and check
	    // whether there is at least one same character in the remainder of the string in O(1)
	    // time because we precomputed it before. Naive method wouldn't work because the string is
	    // length 100.
	    
	    for(int i = 0; i < N; i++){
	        for(int j = i+2; j < N; j++){
	            if(C[i] == C[j]){
	                for(int k = i+1; k < j; k++){
	                    if(cnt[C[k]][N-1] - cnt[C[k]][j] >= 1) return "Dislikes";
	                }
	            }
	        }
	    }
	    
	    return "Likes";
	}

}
