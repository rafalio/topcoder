import java.util.*;

public class MiddleCode {

	public String encode(String st) {
		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> t = new ArrayList<String>();
		for(char c : st.toCharArray()) s.add(c+"");
		
		while(s.size() != 0){
			if(s.size() % 2 != 0){
				t.add(s.remove(s.size()/2));
			} else{
				int mid = s.size()/2;
				if(s.get(mid-1).charAt(0) < s.get(mid).charAt(0)){
					t.add(s.remove(mid-1));
				} else{
					t.add(s.remove(mid));
				}
			}
		}
		
		String out = "";
		for(String a : t) out += a;
		return out;
	}

}
