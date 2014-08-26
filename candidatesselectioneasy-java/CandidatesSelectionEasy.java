import java.util.*;

public class CandidatesSelectionEasy {

	public int[] sort(String[] score, int x) {
	    int N = score.length;
	    Integer[] ret = new Integer[N];
	    for(int i = 0; i < N; i++) ret[i] = i; 
		Arrays.sort(ret, (a, b) -> score[a].charAt(x)-score[b].charAt(x));
		int[] R = new int[N];
		for(int i = 0; i < N; i++) R[i] = ret[i];
		return R;
	}

}
