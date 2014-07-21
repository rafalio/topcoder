import java.util.*;

public class LittleElephantAndBallsAgain {

	public int getNumber(String S) {
		int least = S.length();
		for(int i = 0; i < S.length(); i++){
			char C = S.charAt(i);
			int l = i;
			int r = i;
			for(l = i-1; l >= 0 && S.charAt(l)==C; l--);
			for(r = i+1; r < S.length() && S.charAt(r)==C; r++);
			least = Math.min(least, S.length()-(r-l)+1);
		}
		return least;
	}

}
