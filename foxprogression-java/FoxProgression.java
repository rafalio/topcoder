import java.util.*;

public class FoxProgression {

	public int theCount(int[] seq) {
		if(seq.length == 1) return -1;
		boolean g = seq[1] % seq[0] == 0;
		boolean a = true;
		
		int gDiff = seq[1]/seq[0];
		int aDiff = seq[1]-seq[0];
		
		for(int i = 1; i < seq.length; i++){
			g = g && (seq[i]/seq[i-1] == gDiff && seq[i]%seq[i-1]==0);
			a = a && (seq[i]-seq[i-1] == aDiff);
		}
		if(a && g){
			if(aDiff == 0 && gDiff == 1) return 1;
			return 2;
		}
		if(a || g) return 1;
		return 0;
	}

}
