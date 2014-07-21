import java.util.*;

public class OneDimensionalRobotEasy {

	public int finalPosition(String commands, int A, int B) {
		int pos = 0;
		
		for(char c : commands.toCharArray()){
			if(c == 'L'){
				if(pos > -A) pos--;
			}
			if(c == 'R'){
				if(pos < B) pos++;
			}
		}
		
		return pos;
	}

}
