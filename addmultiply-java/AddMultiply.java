import java.util.*;

public class AddMultiply {

	public int[] makeExpression(int y) {
		
		for(int x1 = -1000; x1 <= 1000; x1++){
			for(int x2 = -1000; x2 <= 1000; x2++){
				for(int x3 = -1000; x3 <= 1000; x3++){
					if(x1 == 0 || x2 == 0 || x3 == 0 || x1 == 1 || x2 == 1 || x3 == 1) continue;
					if(x1*x2 + x3 == y){
//						System.out.println(x1 +  " " + x2 + " " + x3);
						return new int[]{x1,x2,x3};
					}
				}
			}
		}
		return null;
	}

}
