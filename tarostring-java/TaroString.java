import java.util.*;

public class TaroString {

	public String getAnswer(String S) {
		int[] occs = new int[200];
		for(char c : S.toCharArray()){
			occs[c] += 1;
		}
		if(occs['C'] == 1 && occs['A'] == 1 && occs['T'] == 1 && S.matches(".*C.*A.*T.*")) return "Possible";
		return "Impossible";
	}

}
