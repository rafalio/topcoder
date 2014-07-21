import java.util.*;

public class TaroFriends {

	public int getNumber(int[] coordinates, int X) {
		Arrays.sort(coordinates);
		int N = coordinates.length;
		int mid = (coordinates[0] + coordinates[N-1])/2;
		for(int i = 0; i < N; i++){
			if(coordinates[i] <= mid) coordinates[i] += X;
			else coordinates[i] -= X;
		}
		Arrays.sort(coordinates);
		return coordinates[N-1]-coordinates[0];
	}

}
