import java.util.*;

public class ChooseTheBestOne {

	public int countNumber(int N) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 1; i <= N; i++) l.add(i);
		
		int turn = 1;
		
		int idx = 0;
		
		while(true){
			if(l.size() == 1) break;
			
			int howmany = turn*turn*turn;
			
			idx = (idx+howmany) % l.size();
			if(idx == 0){
				l.remove(l.size()-1);
			}
			else{
				l.remove(idx-1);
				idx = idx-1;
			}
			
			
			turn++;
		}
		
		return l.get(0);
		
	}

}
