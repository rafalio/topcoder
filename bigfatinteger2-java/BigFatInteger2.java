import java.util.*;

public class BigFatInteger2 {

	public String isDivisible(int A, int B, int C, int D) {
		HashMap<Integer,Integer> factorsA = getPrimeFactors(A);
		HashMap<Integer,Integer> factorsC = getPrimeFactors(C);
		
		for(int prime : factorsC.keySet()){
			long exp1 = (long)factorsC.get(prime) * D;
			
			long exp2 = 0;
			if(factorsA.containsKey(prime)){
				exp2 = (long)factorsA.get(prime) * B;
			}
			
			if(exp1 > exp2) return "not divisible";
		}
		return "divisible";
	}
	
	private HashMap<Integer,Integer> getPrimeFactors(int A){
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 2; i*i <= A; i++){
			if(A % i == 0){
				int cnt = 0;
				while(A % i == 0){
					A /= i;
					cnt++;
				}
				hm.put(i, cnt);
			}
		}
		if(A != 1){ // it's prime
			hm.put(A, 1);
		}
		return hm;
	}
	
	public void primes(int N){
		boolean[] sieve = new boolean[N+1];
		Arrays.fill(sieve,true);
		for(int i = 2; i*i <= N; i++){
			if(sieve[i]){
				int mul = 2;
				while(i*mul <= N){
					sieve[i*mul] = false;
					mul++;
				}
			}
		}
		for(int i = 2; i <= N; i++){
			if(sieve[i]) System.out.println(i);
		}
	}
	
	public boolean isPrime(int N){
		if(N <= 1) return false;
		for(int i = 2; i*i <= N; i++){
			if(N % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		BigFatInteger2 b = new BigFatInteger2();
		
		b.primes(100);
		
		System.out.println(b.isPrime(1));
		
//		b.getPrimeFactors(382741);
	}

}
