import java.util.*;

public class BishopMove {

	public int howManyMoves2(int r1, int c1, int r2, int c2) {
		
		if(r1 == r2 && c1 == c2) return 0;
		
		if(r1 % 2 == c1 % 2){  // start is black
			if(r2 % 2 != c2%2) return -1;
			if(Math.abs(c1-c2) == Math.abs(r1-r2)) return 1;
			else return 2;
			
		}
		else{
			if(r2%2 == c2%2) return -1;
			if(Math.abs(c1-c2) == Math.abs(r1-r2)) return 1;
			else return 2;
		}
	}
	
	
	// improved version, after the contest
	
	public int howManyMoves(int r1, int c1, int r2, int c2){
		if( (r1+c1)%2 != (r2+c2)%2) return -1; // check if they are of different color
		if(r1==r2 && c1==c2) return 0;
		if(Math.abs(c1-c2) == Math.abs(r1-r2)) return 1;
		return 2;
	}

}
