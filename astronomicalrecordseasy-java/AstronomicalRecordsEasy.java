import java.util.*;

public class AstronomicalRecordsEasy {

	public int minimalPlanets(int[] A, int[] B) {
		getDiv(A);
		getDiv(B);
		int min = A.length + B.length;
		for(int i = 1; i < 250; i++){
			for(int j = 1; j < 250; j++){
				min = Math.min(min, lcs(mul(A,i),mul(B,j)));
			}
		}
		return min;
	}
	
	public int[] mul(int[] A, int num){
		int[] res = new int[A.length];
		for(int i = 0; i < A.length; i++){
			res[i] = A[i] * num;
		}
		return res;
	}
	
	public int lcs(int[] A, int[] B){
		int[][] DP = new int[A.length+1][B.length+1];
		
		for(int i = 1; i <= A.length; i++){
			for(int j = 1; j <= B.length; j++){
				if(A[i-1] == B[j-1]){
					DP[i][j] = DP[i-1][j-1] + 1; 
				} else{
					DP[i][j] = Math.max(DP[i-1][j],DP[i][j-1]);
				}
			}
		}		
		int res = DP[A.length][B.length];
		return res + (A.length-res)+(B.length-res);
	}
	
	public void getDiv(int[] A){
		int min = A[0];
		for(int i : A) min = Math.min(min,i);
		boolean can = true;
		for(int i : A) can = can && (i%min == 0);
		if(can){
			for(int i = 0; i < A.length; i++){
				A[i] = A[i]/min;
			}
		}
	}
	
	public static void main(String[] args) {
		AstronomicalRecordsEasy e = new AstronomicalRecordsEasy();
		System.out.println(e.lcs(new int[]{1,2}, new int[]{2,4}));
	}

}
