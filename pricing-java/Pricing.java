import java.util.*;

public class Pricing {

	public int maxSales(int[] price) {
		Arrays.sort(price);		
		return partition(price, 0, price.length-1, 4);
	}
	
	// partition P from a to b using at most d partitions
	public int partition(int[] P, int a, int b, int d){
		if(a==b) return P[a];
		if(d == 1){ // have to take all
			int max = 0;
			for(int i = a; i <= b; i++){
				max = Math.max(max,(b-i+1)*P[i]);
			}
			return max;
		}
		else{
			int max = 0;
			for(int i = a+1; i <= b; i++){
				int l = partition(P,a,i-1,1);
				int r = partition(P,i,b,d-1);
				max = Math.max(max,l+r);
			}
			return max;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new Pricing().maxSales(new int[]{1,4,5,5,5,5,8,9,80}));
	}

}
