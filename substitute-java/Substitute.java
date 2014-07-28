import java.util.*;

public class Substitute {

	public int getValue(String key, String code) {
		int[] pos = new int[256];
		Arrays.fill(pos, -1);
		
		for(int i = 0; i < key.length(); i++){
			pos[key.charAt(i)] = i;
		}
		
		String res = "";
		for(char c : code.toCharArray()){
			if(pos[c] == -1) continue;
			else{
				res += Integer.toString((pos[c]+1)%10);
			}
		}
		
		return new Integer(res);
	}

}
