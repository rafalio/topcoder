import java.util.*;

public class MiniatureDachshund {

	public int maxMikan(int[] mikan, int weight) {
		Arrays.sort(mikan);
		for(int i = 0; i < mikan.length; i++){
			if(weight + mikan[i] > 5000) return i;
			weight += mikan[i];
		}
		return mikan.length;
	}

}
