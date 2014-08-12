import java.util.*;

public class RectangleCoveringEasy {
    
    // CRAP, misread the question and did it wrong...
    // first 250 ever that I did wrong, be CAREFUL next time

	public int solve(int holeH, int holeW, int boardH, int boardW) {
	    if(boardH == holeH && boardW == holeW) return -1;
	    if(boardH == holeW && boardW == holeH) return -1;
	    if(boardH >= holeH && boardW >= holeW) return 1;
	    if(boardH >= holeW && boardW >= holeH) return 1;
		return -1;
	}

}
