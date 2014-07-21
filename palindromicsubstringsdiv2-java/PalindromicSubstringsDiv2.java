import java.util.*;

public class PalindromicSubstringsDiv2 {

	public int count(String[] S1, String[] S2) {
		String s1 = "";
		String s2 = "";
		for(String s : S1) s1 += s;
		for(String s : S2) s2 += s;
		String s = s1+s2;
		
		
		int cnt = 0;
		
		int N = s.length();
		boolean DP[][] = new boolean[N][N];
		
		for(int i = N-1; i >= 0; i--){
			for(int j = 0; j < N; j++){
				if(j <= i) DP[i][j] = true;
				else DP[i][j] = DP[i+1][j-1] && s.charAt(i) == s.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++){
			for(int j = i; j < N; j++){
				if(DP[i][j]) cnt++;
			}
		}
		
		return cnt;
	}
	
//	public boolean palindrome(String s, int i, int j){
//		for(int a = i; a <= (j-i)/2+i; a++){
//			if(s.charAt(a) != s.charAt(j-a+i)) return false;
//		}
//		return true;
//	}

}
