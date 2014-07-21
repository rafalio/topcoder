import java.util.*;

public class BoundingBox {

	public int smallestArea(int[] X, int[] Y) {
		int tlX = Integer.MAX_VALUE;
		int tlY = Integer.MIN_VALUE;
		int blX = Integer.MIN_VALUE;
		int blY = Integer.MAX_VALUE;
		
		for(int i = 0; i < X.length; i++){
			tlX = Math.min(tlX, X[i]);
			tlY = Math.max(tlY, Y[i]);
			blX = Math.max(blX, X[i]);
			blY = Math.min(blY, Y[i]);
		}
		
		return Math.abs(tlX-blX)*Math.abs(tlY-blY);
		
		
	}

}
