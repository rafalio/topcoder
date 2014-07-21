import java.util.*;

public class FoxAndClassroom {

	public String ableTo(int n, int m) {
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				boolean[][] mask = new boolean[n][m];
				
				int vis = 0;
				int a = i;
				int b = j;
				
				while(vis < n*m){
					if(mask[a][b]) break;
					mask[a][b] = true;
					a = (a+1)%n;
					b = (b+1)%m;
					vis++;
				}
				
				if(vis == n*m) return "Possible";
			}
		}
		
		return "Impossible";
		
		
		
	}

}
