import java.util.*;

public class BinPackingEasy {

	public int minBins(int[] item) {
		Arrays.sort(item);
		int cnt = 0;
		int i = 0;
		int j = item.length-1;
		while(i <= j){
			if(item[j] >= 200 || i==j){
				cnt++;
				j--;
			} else{
				if(item[i]+item[j] <= 300){
					cnt++;
					i++;
					j--;
				} else{
					cnt += 1;
					j--;
				}
			}
		}
		return cnt;
	}

}
