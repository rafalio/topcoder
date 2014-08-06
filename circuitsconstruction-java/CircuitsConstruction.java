import java.util.*;

public class CircuitsConstruction {
	int pos = 0;

	public int maximizeResistance(String circuit, int[] conductors) {
		Arrays.sort(conductors);
		int n = dfs(circuit);
		int res = 0;
		for(int i = 0; i < n; i++) res += conductors[conductors.length-1-i];
		return res;
	}
	
	public int dfs(String s){
		char type = s.charAt(pos++);
		if(type == 'X') return 1;
		
		int l = dfs(s);
		int r = dfs(s);
		
		return (type == 'A') ? l+r : Math.max(l,r);
	}

}
