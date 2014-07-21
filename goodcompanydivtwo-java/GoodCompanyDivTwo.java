import java.util.*;

public class GoodCompanyDivTwo {

	public int countGood(int[] superior, int[] workType) {
		int N = superior.length;
		int distinct = 0;
		
		for(int i = 0; i < N; i++){
			boolean[] used = new boolean[100];
			used[workType[i]] = true;
			boolean count = true;
			for(int j = i+1; j < N; j++){
				if(superior[j] == i){
					int type = workType[j];
					if(used[type]){
						count = false;
						break;
					}
					used[type] = true;
				}
			}
			if(count) distinct++;
		}
		return distinct;
	}

}
