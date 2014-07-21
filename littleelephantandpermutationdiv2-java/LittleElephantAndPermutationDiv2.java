import java.util.*;

public class LittleElephantAndPermutationDiv2 {
	long res = 0;

	public long getNumber(int N, int K) {
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = i+1;
		permute(A,0,K);
		return res;
	}
	
	void permute(int[] A, int idx, int K){
		if(idx == A.length){
			int magic = 0;
			for(int i = 0; i < A.length; i++){
				magic += Math.max(A[i],i+1);
			}
			if(magic >= K) res += fact(A.length);
		}
		else{
			for(int i = idx; i < A.length; i++){
				swap(A,i,idx);
				permute(A,idx+1,K);
				swap(A,i,idx);
			}
		}
	}
	
	void swap(int[] A, int a, int b){
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
	}
	
	long fact(int i){
		long res = 1;
		for(int j = 2; j <= i; j++) res *= j;
		return res;
	}
	
	

}
