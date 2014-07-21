import java.util.*;

public class LittleElephantAndDouble {

	public String getAnswer(int[] A) {
		for(int i = 0; i < A.length; i++){
			for(int j = 0; j < A.length; j++){
				if(A[j] < A[i]){
					if(A[i] % A[j] != 0) return "NO";
					if(!pow2(A[i]/A[j])) return "NO";
				}
			}
		}
		return "YES";
	}
	
	private boolean pow2(int n){
		for(int i = 1; i <= 31; i++){
			if(Math.pow(2,i) == n) return true;
		}
		return false;
	}

}
