import java.util.*;

public class CheatingQuiz {

	public int[] howMany(String answers) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(char ch : answers.toCharArray()){
			if(ch == 'A') a++;
			else if(ch == 'B') b++;
			else c++;
		}
		
		int[] res = new int[answers.length()];
		
		int i = 0;
		for(char ch : answers.toCharArray()){
			int pos = 0;
			if(a > 0) pos++;
			if(b > 0) pos++;
			if(c > 0) pos++;
			
			res[i] = pos;
			
			if(ch == 'A') a--;
			if(ch == 'B') b--;
			if(ch == 'C') c--;
			
			i++;
		}
	
		return res;
	}
	

}
