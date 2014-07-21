import java.util.*;

public class TaroCards {

	public long getNumber(int[] first, int[] second, int K) {
		
		ArrayList<Integer[]> ar = new ArrayList<Integer[]>();
		int N = first.length;
		for(int i = 0; i < N; i++){
			ar.add(new Integer[]{first[i],second[i]});
		}
		Collections.sort(ar, new Comparator<Integer[]>() {
			public int compare(Integer[] o1, Integer[] o2) {
				return o1[1]-o2[1];
			}
		});
		
		long nums = 1;
		
		boolean[] marked = new boolean[10];
		
		
		return nums;
	}

}
