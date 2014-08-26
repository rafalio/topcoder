import java.util.*;

public class FibonacciDiv2 {

	public int find(int N) {
		int[] fib = new int[100];
		fib[1] = 1;
		for(int i = 2; i < 100; i++){
		    fib[i] = fib[i-1] + fib[i-2];
		}
		int mindiff = Integer.MAX_VALUE;
		for(int i = 0; i < 100; i++){
		    mindiff = Math.min(mindiff,Math.abs(fib[i]-N));
		}
		return mindiff;
	}

}
