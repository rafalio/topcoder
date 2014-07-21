import java.util.*;

// NOT DONE
public class PowerOfThree {
	class Tuple{
		long x;
		long y;
		public Tuple(long xx, long yy) {
			x = xx;
			y = yy;
		}
	}

	public String ableToGet(int x, int y) {
		Set<Tuple> visited = new HashSet<Tuple>();
		boolean canReach = reach((long)x, (long)y, 0,0,0);
		if(canReach) return "Possible";
		else return "Impossible";
	}
	
	private boolean reach(long x, long y, long curx, long cury, int step){
		if(curx < 1e9 && curx > -1e9 && cury < 1e9 && cury > -1e9)
			System.out.println("x: " + curx + " y: " + cury);
//		if(x == curx && y == cury) return true;
		if(step >= 20) return false;
		if(true){
			long val = (long)Math.pow(3,step);
			boolean ret = false;
			ret  = ret || reach(x,y,curx+val,cury,step+1);
			if(ret) return true;
			ret  = ret || reach(x,y,curx,cury+val,step+1);
			if(ret) return true;
			ret  = ret || reach(x,y,curx-val,cury,step+1);
			if(ret) return true;
			ret  = ret || reach(x,y,curx,cury-val,step+1);
			return ret;
		}
		return false;
		
		/* 387420489
		 * 107616802
		 * 
		 * possible
		 * 
		 * 762548944  
		 * -90699264
		 * 
		 * impossible
		 * 
		 * 762548942  
		 * -90699269 
		 */
	}
	
	public static void main(String[] args) {
		System.out.println(new PowerOfThree().ableToGet(0, 0));
	}

}
