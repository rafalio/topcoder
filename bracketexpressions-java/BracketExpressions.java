import java.util.*;

public class BracketExpressions {
	
	boolean possible = false;

	
	// what I did during the contest
	public String ifPossible2(String expression) {
		int cnt = 0;
		for(char c : expression.toCharArray()){
			if(c == 'X') cnt++;
		}
		
		dfs(expression.toCharArray(), 0, cnt);
		if(possible) return "possible";
		else return "impossible";
	}
	
	public void dfs(char[] C, int pos, int left){
		if(pos > C.length) return;
		else if(left == 0){
			possible = possible || isValid(new String(C)); 
		}
		else{
			if(C[pos] == 'X'){
				for(char c : "([{}])".toCharArray()){
					C[pos] = c;
					dfs(C,pos+1,left-1);
					C[pos] = 'X';
				}
			} else{
				dfs(C,pos+1,left);
			}
		}
	}
	
	
	// Redoing, after the editorial, using powers of 6
	public String ifPossible(String expression){
		int N = expression.length();
		ArrayList<Integer> idxs = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++){
			if(expression.charAt(i) == 'X') idxs.add(i);
		}
		
		int t = idxs.size();
		
		int[] pow6 = new int[6];
		pow6[0] = 1;
		for(int i = 1; i < 6; i++) pow6[i] = pow6[i-1]*6;
		
		char[] brackets = "({[]})".toCharArray();
		char[] expr     = expression.toCharArray();
		
		for(int i = 0; i < pow6[t]; i++){ // iterate over all the numbers between [0..(6^t-1)] since there are so many total possibilities for replacing Xs
			
			for(int j = 0; j < t; j++){
				expr[idxs.get(j)] = brackets[(i / pow6[j]) % 6];
			}
			if(isValid(new String(expr))) return "possible";
		}
		
		return "impossible";
	}
	
	
	// Check if a bracket string is valid
	
	public boolean isValid(String S) {
		  Stack<String> s = new Stack<String>();
		  for(char c : S.toCharArray()){
		    String cc = String.valueOf(c);

		    if(c == '{' || c == '(' || c == '[') s.push(cc);

		    else{
		      if(s.empty()) return false;
		      char top = s.peek().toCharArray()[0];

		      if( (top == '{' && c == '}') ||
		          (top == '(' && c == ')')  ||
		          (top == '[' && c == ']') ){
		        s.pop();
		      } else return false;
		    }

		  }
		  return s.empty();
	}
	

}
