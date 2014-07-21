import java.util.*;

/**
 * Unfortunately this times out on the largest case :(
 */

public class SimilarNames2 {

	long ways = 0;
	
	public int count(String[] names, int L) {
		HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		
		for(String n : names){
			if(!hm.containsKey(n)){
				hm.put(n, new ArrayList<String>());
				for(String nn : names){
					if(n == nn) continue;
					if(nn.startsWith(n)) hm.get(n).add(nn);
				}
			}
		}
		
		for(String n : names){
			chain(names, 1, L, n ,hm);
		}
		
		long result = (long) ((ways*factorial(names.length-L)) % (1e9+7));
		
//		System.out.println(ways);
		System.out.println(result);
		
		return (int)result;
	}
	
	private void chain(String[] names, int idx, int L, String w, HashMap<String,ArrayList<String>> hm){
		if(idx == L){
			ways++;
		} else{
			for(String word : hm.get(w)){
				chain(names,idx+1,L,word,hm);
			}				
		}
	}
	
	private int factorial(int N){
		if(N == 0) return 1;
		long i = N;
		for(int j = N-1; j >= 2; j--){
			i = (i * j) % 1000000007;
		}
		return (int)i;
	}
	
	public static void main(String[] args) {
		String[] names = new String[]{"aya", "saku", "emi", "ayane", "sakura", "emika", "sakurako"};
        int L = 3;
        
        String[] n = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa", "aaaaaaaa", "aaaaaaaaa", "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaaaaaa", "aaaaaaaaaaaaa", "aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        
        SimilarNames2 s = new SimilarNames2();
        
        s.count(n,8);
	}

}
