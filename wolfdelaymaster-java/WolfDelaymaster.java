import java.util.*;

public class WolfDelaymaster {

	public String check(String str) {
		if(valid(str)) return "VALID";
		return "INVALID";
	}
	
	private boolean valid(String str){
		if(str.length() == 0) return false;
		int wcount = 0;
		int i = 0;
		while(i < str.length() && str.charAt(i) == 'w'){
			wcount++;
			i++;
		}
		if(wcount == 0) return false;
		boolean valid = true;
		if(str.length() < wcount*4) return false;
		valid = str.substring(0, wcount*4).equals(makeString(wcount));
		if(str.length() == wcount*4) return valid;
		return valid && valid(str.substring(wcount*4));
	}
	
	private String makeString(int cnt){
		String res = "";
		for(int i = 0; i < cnt; i++) res += 'w';
		for(int i = 0; i < cnt; i++) res += 'o';
		for(int i = 0; i < cnt; i++) res += 'l';
		for(int i = 0; i < cnt; i++) res += 'f';
		return res;
	}

}
