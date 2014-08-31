// topcoder: radicality

import java.util.*;

public class MergeStrings {

	public String getmin(String S, String A, String B) {
		String[][][] DP = new String[51][51][51];
		
		for(int i = S.length(); i >= 0; i--){
		    for(int j = A.length(); j >= 0; j--){
		        for(int k = B.length(); k >= 0; k--){
		            if(j+k != i) continue; //speed up
		            if(i == S.length()){
		                DP[i][j][k] = ""; // valid string
		            }
		            else{
		                DP[i][j][k] = "[invalid]";
		                char c = S.charAt(i);
		                if(j < A.length() && (c=='?' || c==A.charAt(j))){ // use A
		                    String x = DP[i+1][j+1][k];
		                    if(x != "[invalid]" && (A.charAt(j)+x).compareTo(DP[i][j][k]) < 0){
		                        DP[i][j][k] = A.charAt(j)+x;
		                    }
		                }
		                if(k < B.length() && (c=='?' || c==B.charAt(k))){ // use B
		                    String x = DP[i+1][j][k+1];
		                    if(x != "[invalid]" && (B.charAt(k)+x).compareTo(DP[i][j][k]) < 0){
		                        DP[i][j][k] = B.charAt(k)+x;
		                    }
		                }
		            }
		        }
		    }
		}
		
		
		String ret = DP[0][0][0];
		if(ret == "[invalid]") return "";
		return ret;
	}

}
