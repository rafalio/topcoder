public class CompositeSmash {

	public String thePossible(int N, int target) {
		if(N < target) return "No";
		if(N == target || gcd(N,target) == 1) return "Yes";
		
		return "No";
	}
	
	public int gcd(int a, int b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

}
