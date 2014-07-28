import java.util.*;

public class HappyLetterDiv2 {

	
	// Leader election problem
	
	public char getHappyLetter(String letters) {
		int[] occ = new int[255];
		int N = letters.length();
		for(char c : letters.toCharArray()){
			occ[c]++;
		}
		char max = '.';
		for(char c = 'a'; c <= 'z'; c++){
			if(occ[c] > occ[max]) max = c;
		}
		if(occ[max] > N-occ[max]) return max;
		return '.';
	}

}
