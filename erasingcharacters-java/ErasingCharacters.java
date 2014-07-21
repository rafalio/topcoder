import java.util.*;

public class ErasingCharacters {

	public String simulate(String s) {
		ArrayList<String> a = new ArrayList<String>();
		for(char c : s.toCharArray()){
			a.add(c+"");
		}
		
		loop:
		while(true){
			for(int i = 0; i < a.size()-1; i++){
				if(a.get(i).equals(a.get(i+1))){
					a.remove(i);
					a.remove(i);
					continue loop;
				}
			}
			break;
		}
		String out = "";
		for(String m : a) out += m;
		return out;
	}

}
