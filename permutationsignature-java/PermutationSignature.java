import java.util.*;

public class PermutationSignature {

	public int[] reconstruct(String signature) {
		int[] res = new int[signature.length()+1];
		String sig = signature + "I";
		int ctr = 1;
		
		for(int pos = 0; pos < sig.length(); pos++){
			if(sig.charAt(pos) == 'I'){
				int m = pos;
				do{
					res[m] = ctr;
					ctr++;
					m--;
				} while(m >= 0 && sig.charAt(m) == 'D');
					
			}
		}
		
		
		
		return res;
	}

}
