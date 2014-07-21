import java.util.*;

public class ConvertibleStrings {

	public int leastRemovals(String A, String B) {
		boolean[][] map = new boolean[26][26];
		for(int i = 0; i < A.length(); i++){
			for(int j = 0; j < B.length(); j++){
				map[A.charAt(i)-'A'][B.charAt(j)-'A'] = true;
				map[B.charAt(j)-'A'][A.charAt(i)-'A'] = true;
			}
		}
		int rems = 0;
		while(!solved(map)){
			loop:
			for(int i = 0; i < map.length; i++){
				int cnt = 0;
				for(int j = 0; j < map[0].length; j++){
					if(map[i][j]) cnt++;
				}
				if(cnt > 1){
					for(int j = 0; j < map[0].length; j++){
						if(map[i][j]){
							map[i][j] = false;
							map[j][i] = false;
							rems++;
							break loop;
						}
					}
				}
			}
		}
		return rems;
	}
	
	
	
	boolean solved(boolean[][] map){
		boolean ok = true;
		loop:
		for(int i = 0; i < map.length; i++){
			boolean f = false;
			for(int j = 0; j < map[0].length; j++){
				if(f && map[i][j]) return false;
				else f |= map[i][j];
			}
		}
		return ok;		
	}

}
