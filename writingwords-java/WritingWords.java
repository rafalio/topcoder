import java.util.*;

public class WritingWords {

    // Yeah, getting quick at parsing problems! 
    // 249.77 points, solved in around 25 seconds.
	public int write(String word) {
		int ret = 0;
		for(char c : word.toCharArray()){
		    ret += c-'A'+1;
		}
		
		return ret;
	}

}
