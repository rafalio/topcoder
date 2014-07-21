import java.util.*;

public class RaiseThisBarn {

	public int calc(String str) {
		int cnt = 0;
		for(char c : str.toCharArray()){
			if(c == 'c') cnt++;
		}
		if(cnt % 2 != 0) return 0;
		if(cnt == 0) return str.length()-1;
		else{
			int c = 0;
			int i = 0;
			while(c != cnt/2){
				if(str.charAt(i) == 'c') c++;
				i++;
			}
			
			int res = 1;
			while(i < str.length() && str.charAt(i) == '.'){
				res++;
				i++;
			}
			
			return res;
			
		}
	}

}
