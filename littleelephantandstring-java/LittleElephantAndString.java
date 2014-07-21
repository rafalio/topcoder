import java.util.*;

public class LittleElephantAndString {

	public int getNumber(String A, String B) {
		char[] A1 = new String(A).toCharArray();
		char[] B1 = new String(B).toCharArray();
		Arrays.sort(A1);
		Arrays.sort(B1);
		if(!Arrays.equals(A1, B1)) return -1;
		
		int N = A.length();
		for(int i = 0; i < N; i++){
			if(isSubsequence(A,B.substring(i))) return i;
		}
		return N;
	}
	private boolean isSubsequence(String s, String seq){
		int j = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == seq.charAt(j)) j++;
			if(j == seq.length()) break;
		}
		return (j == seq.length());
	}

}
