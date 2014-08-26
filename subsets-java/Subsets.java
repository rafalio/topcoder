import java.util.*;

public class Subsets {
    int[] next;
    int[] nums;

	public int findSubset(int[] numbers) {
	    Arrays.sort(numbers);
	    int N = numbers.length;
	    next = new int[N];
	    int t = N;
	    for(int i = N-1; i >= 0; i--){
	        if(i < N-1 && numbers[i+1] > numbers[i]) t = i+1;
	        next[i] = t;
	    }
	    nums = numbers;
	    return backtrack(0,0,1);
	}
	
	public int backtrack(int i, int sum, int prod){
	    if(i == nums.length || prod*nums[i] > sum + nums[i]){
	        return (sum > prod) ? 1 : 0;
	    } else {
	        return backtrack(i+1, sum+nums[i], prod*nums[i]) + backtrack(next[i],sum,prod);
	    }
	}

}
