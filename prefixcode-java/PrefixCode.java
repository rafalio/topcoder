import java.util.*;

public class PrefixCode {

	public String isOne(String[] words) {
		int N = words.length;		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(i == j) continue;
				if(words[j].startsWith(words[i])){
					return "No, " + i;
				}
			}
		}
		return "Yes";
	}

}
